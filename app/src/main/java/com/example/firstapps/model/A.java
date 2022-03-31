package com.example.firstapps.model;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class A extends AppCompatActivity {

    EditText editNama, editAlamat, editNohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        editNama = findViewById(R.id.editNama);
        editAlamat = findViewById(R.id.editAlamat);
        editNohp = findViewById(R.id.editNohp);

    }

    public void submit(View view) {
        UserModel user = new UserModel();
        user.setNama(editNama.getText().toString());
        user.setAlamat(editAlamat.getText().toString());
        user.setNohp(editNohp.getText().toString());

        Intent intent = new Intent(this, B.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}