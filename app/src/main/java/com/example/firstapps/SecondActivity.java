package com.example.firstapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editEmail = findViewById(R.id.editEmail);
    }

    public void login(View view) {
        Intent intent = new Intent(this,HomeActivity.class);
        intent.putExtra("email",editEmail.getText().toString());
        startActivity(intent);
    }
}