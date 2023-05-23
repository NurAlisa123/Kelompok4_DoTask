package com.example.projekakhirpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterDosen extends AppCompatActivity {
    Button buttonLogin, buttonRegister;
    EditText registnama,registusername,registpassword,registnip;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_dosen);

        registnama = findViewById(R.id.editTextTextPersonName19);
        registusername = findViewById(R.id.editTextTextPersonName4);
        registpassword = findViewById(R.id.editTextTextPersonName2);
        registnip = findViewById(R.id.editTextPhone);

        buttonLogin  = findViewById(R.id.textView11);
        buttonRegister = findViewById(R.id.button);
        buttonLogin.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (getApplicationContext(), HomePageDosen.class);
                startActivity(i);
            }
        }));
        buttonRegister.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("Dosen");
                String nama = registnama.getText().toString();
                String username = registusername.getText().toString();
                String password = registpassword.getText().toString();
                String nip = registnip.getText().toString();

                HelperDosen helperDosen = new HelperDosen(nama,username,password,nip);
                reference.child(username).setValue(helperDosen);

                Intent i = new Intent (getApplicationContext(), Login.class);
                startActivity(i);
            }
        }));
    }
}