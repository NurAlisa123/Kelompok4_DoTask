package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WelcomePage extends AppCompatActivity {
    Button buttonOrtu;
    Button buttonDosen;
    Button buttonMhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        buttonOrtu = findViewById(R.id.btnOrtu);
        buttonDosen= findViewById(R.id.btnDosen);
        buttonMhs  = findViewById(R.id.btnMhs);

        buttonOrtu.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (getApplicationContext(), HomePageOrtu.class);
                startActivity(i);
            }
        }));

        buttonDosen.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (getApplicationContext(), LoginDosen.class);
                startActivity(i);
            }
        }));

        buttonMhs.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent (getApplicationContext(), LoginMahasiswa.class);
                startActivity(x);
            }
        }));
    }
}