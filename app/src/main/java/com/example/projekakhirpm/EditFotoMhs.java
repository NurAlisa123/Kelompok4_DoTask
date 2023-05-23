package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditFotoMhs extends AppCompatActivity {
    Button buttonCariFoto;

    Button buttonSimpanFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_foto_mhs);

        buttonCariFoto= findViewById(R.id.buttoncari);
        buttonSimpanFoto = findViewById(R.id.buttonsimpanfoto);

        buttonCariFoto.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ProfilMhs.class);
                startActivity(i);
            }
        }));

        buttonSimpanFoto.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ProfilMhs.class);
                startActivity(i);
            }
        }));
    }
}
