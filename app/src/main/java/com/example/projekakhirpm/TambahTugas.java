package com.example.projekakhirpm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TambahTugas extends AppCompatActivity {
    EditText tugas, matkul, tenggatwaktu;
    Button buttontambahkan;
    FirebaseDatabase database;
    DatabaseReference reference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_tugas);

        tugas = findViewById(R.id.editTexttugastambah);
        matkul = findViewById(R.id.editTextmatkul);
        tenggatwaktu = findViewById(R.id.editTextDate);
        buttontambahkan =findViewById(R.id.buttontambah);

        buttontambahkan.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("Tugas");
                String namatugas = tugas.getText().toString();
                String namamatkul = matkul.getText().toString();
                String tenggat = tenggatwaktu.getText().toString();
                HelperTambahTugas HelperTambahTugas = new HelperTambahTugas(namatugas, namamatkul, tenggat);
                reference.child(namatugas).setValue(HelperTambahTugas);
                Intent intent = new Intent(TambahTugas.this, DaftarTugas.class);
                startActivity(intent);
                    }
                });
            }



        }

