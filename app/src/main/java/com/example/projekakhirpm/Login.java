package com.example.projekakhirpm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class Login extends AppCompatActivity {

    ImageButton back;
    Button butregis, butlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        back = findViewById(R.id.imageButton);
        butregis = findViewById(R.id.buttonregis);
        butlogin = findViewById(R.id.buttonlogin);

        back.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (Login.this, WelcomePage.class);
                startActivity(i);
            }
        }));

        butregis.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (Login.this, Register.class);
                startActivity(i);
            }
        }));

        butlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (Login.this, HomePageOrtu.class);
                startActivity(i);
            }

                                });
    }
}
