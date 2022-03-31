package com.example.firstapps.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class B extends AppCompatActivity {

    TextView textNama, textAlamat, textNohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        textNama = findViewById(R.id.textNama);
        textAlamat = findViewById(R.id.textAlamat);
        textNohp = findViewById(R.id.textNohp);


        UserModel user = getIntent().getExtras().getParcelable("user");
        textNama.setText(user.getNama());
        textAlamat.setText(user.getAlamat());
        textNohp.setText(user.getNohp());
    }

    public void dialUp(View view) {

        String data = textNohp.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+data));
        startActivity(intent);
    }


}