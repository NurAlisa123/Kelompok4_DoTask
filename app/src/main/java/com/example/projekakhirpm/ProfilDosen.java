package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfilDosen extends AppCompatActivity {
    Button btnkeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_dosen);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setSelectedItemId(R.id.Profil);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.Profil:
                    startActivity(new Intent(ProfilDosen.this, HomePageDosen.class));
                    finish();
                    return true;
                case R.id.home:
                    return true;
            }
            return false;
        });

        btnkeluar = findViewById(R.id.buttonlogout);
        btnkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfilDosen.this, Login.class);
                startActivity(i);
            }
        });


    }
}