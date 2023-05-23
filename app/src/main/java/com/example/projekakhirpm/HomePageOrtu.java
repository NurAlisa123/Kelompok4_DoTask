package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageOrtu extends AppCompatActivity {
    Button butceknilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_ortu);

        butceknilai = findViewById(R.id.buttonceknilai);

        butceknilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (HomePageOrtu.this, CekNilaiOrtu.class);
                startActivity(i);
            }
        });

    }
}