package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
    Button buttonDosen;
    Button buttonMhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        buttonDosen= findViewById(R.id.btnDosen);
        buttonMhs  = findViewById(R.id.btnMhs);

        buttonDosen.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (getApplicationContext(), RegisterDosen.class);
                startActivity(i);
            }
        }));

        buttonMhs.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (getApplicationContext(), Register_Mhs.class);
                startActivity(i);
            }
        }));
    }
}