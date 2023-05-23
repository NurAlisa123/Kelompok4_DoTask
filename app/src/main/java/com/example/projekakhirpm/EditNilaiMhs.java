package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditNilaiMhs extends AppCompatActivity {
    Button buttonlihataktivitas;

    Button buttonberinilai ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_nilai_mhs);

        buttonlihataktivitas= findViewById(R.id.buttonlihat);
        buttonberinilai = findViewById(R.id.buttonberinilai);

        buttonlihataktivitas.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),DaftarTugas.class);
                startActivity(i);
            }
        }));

        buttonberinilai.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), HomePageDosen.class);
                startActivity(i);
            }
        }));
    }
}