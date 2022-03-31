package com.example.firstapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView textEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textEmail = findViewById(R.id.textEmail);
        String email= getIntent().getExtras().getString("email");
        textEmail.setText(email);
    }
}