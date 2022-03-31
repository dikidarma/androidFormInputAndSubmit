package com.example.firstapps.model;

import android.os.Parcel;
import android.os.Parcelable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel implements Parcelable {

    private String nama;
    private String alamat;
    private String nohp;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.alamat);
        dest.writeString(this.nohp);
    }

    public void readFromParcel(Parcel source) {
        this.nama = source.readString();
        this.alamat = source.readString();
        this.nohp = source.readString();
    }

    protected UserModel(Parcel in) {
        this.nama = in.readString();
        this.alamat = in.readString();
        this.nohp = in.readString();
    }

    public static final Creator<UserModel> CREATOR = new Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel source) {
            return new UserModel(source);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };
}
