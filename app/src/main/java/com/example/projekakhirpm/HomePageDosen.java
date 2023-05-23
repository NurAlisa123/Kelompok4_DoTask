package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePageDosen extends AppCompatActivity {
    Button buttonEdit;
    Button buttonHapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_dosen);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setSelectedItemId(R.id.bottomNav);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    return true;
                case R.id.Profil:
                    startActivity(new Intent(HomePageDosen.this, ProfilDosen.class));
                    finish();
                    return true;
            }
            return false;
        });

        buttonEdit = findViewById(R.id.buttonedit1);
        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePageDosen.this, EditNilaiMhs.class);
                startActivity(i);
            }
        });

        buttonHapus = findViewById(R.id.buttonDelete1);
        buttonHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePageDosen.this, HapustugasMhs.class);
                startActivity(i);
            }
        });

        buttonEdit = findViewById(R.id.buttonedit2);
        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePageDosen.this, EditNilaiMhs.class);
                startActivity(i);
            }
        });

        buttonHapus = findViewById(R.id.buttondelete2);
        buttonHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePageDosen.this, HapustugasMhs.class);
                startActivity(i);
            }
        });
    }
}