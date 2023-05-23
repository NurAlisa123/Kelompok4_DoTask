package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HapustugasMhs extends AppCompatActivity {
    Button buttonhapustugas;
    Button buttonsimpanperubahan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hapustugas_mhs);

        buttonhapustugas = findViewById(R.id.buttonhapustugas);
        buttonsimpanperubahan = findViewById(R.id.buttonsimpanperubahan);

        buttonhapustugas.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), HapustugasMhs.class);
                startActivity(i);
            }
        }));

        buttonsimpanperubahan.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DaftarTugas.class);
                startActivity(i);
            }
        }));
    }
}