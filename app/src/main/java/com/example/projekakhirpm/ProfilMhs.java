package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfilMhs extends AppCompatActivity {
    Button buttonEditFotoMhs;
    Button buttonKeluarMhs;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_mhs);

        buttonEditFotoMhs = findViewById(R.id.buttonEditMhs);
        buttonKeluarMhs = findViewById(R.id.buttonKeluar);

        buttonEditFotoMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfilMhs.this, EditFotoMhs.class);
                startActivity(i);
            }
        });

        buttonKeluarMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfilMhs.this, Login.class);
                startActivity(i);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setSelectedItemId(R.id.bottomNav);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    startActivity(new Intent(ProfilMhs.this, HomePageMhs.class));
                    finish();
                    return true;
                case R.id.tugas:
                    startActivity(new Intent(ProfilMhs.this, DaftarTugas.class));
                    finish();
                    return true;
                case R.id.Profil:
                    startActivity(new Intent(ProfilMhs.this, ProfilMhs.class));
                    finish();
                    return true;
            }
            return false;
        });
    }
}