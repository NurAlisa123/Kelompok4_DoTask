package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register_Mhs extends AppCompatActivity {

    EditText registnama, registnim, registusername, registpassword, registnip;
    Button buttonloginn, buttonRegisterr;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_mhs);

        registnama = findViewById(R.id.editTextTextPersonName19);
        registnim = findViewById(R.id.editTextNumber2);
        registusername = findViewById(R.id.editTextTextPersonName4);
        registpassword = findViewById(R.id.editTextTextPersonName2);
        registnip = findViewById(R.id.editTextNumber);

        buttonloginn = findViewById(R.id.buttonloginpendaftaran);
        buttonRegisterr = findViewById(R.id.button12);
        buttonloginn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (getApplicationContext(), Login.class);
                startActivity(i);
            }
        }));
        buttonRegisterr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("Mahasiswa");
                String nama = registnama.getText().toString();
                String nim = registnim.getText().toString();
                String username = registusername.getText().toString();
                String password = registpassword.getText().toString();
                String nip = registnip.getText().toString();

                HelperMhs helperMhs = new HelperMhs(nama,nim,username,password,nip);
                reference.child(username).setValue(helperMhs);

                Intent i = new Intent (getApplicationContext(), Login.class);
                startActivity(i);
            }
        });
    }
}

