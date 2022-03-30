package com.example.firstapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText editNama,editAngka1,editAngka2;
    TextView text,textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAngka1 = findViewById(R.id.editAngka1);
        editAngka2 = findViewById(R.id.editAngka2);
        textHasil = findViewById(R.id.textHasil);

        text= findViewById(R.id.textView);
        text.setText(new Date().toString());
        editNama = findViewById(R.id.editNama);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = editNama.getText().toString() ;
                text.setTextSize(Float.parseFloat(nama));
            }
        });
    }

    public void penambahan(View view) {
        int angka1 = Integer.parseInt(editAngka1.getText().toString());
        int angka2 = Integer.parseInt(editAngka2.getText().toString());
        textHasil.setText(String.valueOf(angka1+angka2) );
    }

//    public void Submit(View view) {
//        Toast.makeText(getApplicationContext(),"Mantap",Toast.LENGTH_SHORT).show();
//    }
}