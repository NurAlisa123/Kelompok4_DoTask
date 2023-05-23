package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DaftarTugas extends AppCompatActivity {
    ImageButton buttontambahtugas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_tugas);

        buttontambahtugas = findViewById(R.id.imageButtonTambahtgs);

        buttontambahtugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarTugas.this, TambahTugas.class);
                startActivity(intent);
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setSelectedItemId(R.id.bottomNav);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    startActivity(new Intent(DaftarTugas.this, HomePageMhs .class));
                    finish();
                    return true;
                case R.id.tugas:
                    return true;
                case R.id.Profil:
                    startActivity(new Intent(DaftarTugas.this, ProfilMhs .class));
                    finish();
                    return true;
            }
            return false;
        });
    }
}