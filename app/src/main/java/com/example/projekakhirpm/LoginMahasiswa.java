package com.example.projekakhirpm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class LoginMahasiswa extends AppCompatActivity {
    ImageButton back;
    Button butregisMhs, butloginMhs;
    EditText loginusername, loginpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mahasiswa);

        loginusername = findViewById(R.id.EditUsernameMhs);
        loginpassword = findViewById(R.id.PasswordMhs);
        back = findViewById(R.id.imageButton);
        butregisMhs = findViewById(R.id.buttonregisMhs);
        butloginMhs = findViewById(R.id.buttonloginMhs);

        back.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginMahasiswa.this, WelcomePage.class);
                startActivity(i);
            }
        }));

        butregisMhs.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginMahasiswa.this, Register_Mhs.class);
                startActivity(i);
            }
        }));

        butloginMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!validateUsername() | !validatePassword()) {
                } else {
                    checkUser();
                }
            }
        });
    }
    public  Boolean validateUsername(){
        String val = loginusername.getText().toString();
        if(val.isEmpty()){
            loginusername.setError("Silaahkan Diisi");
            return  false;
        }else {
            loginusername.setError(null);
            return true;
        }
    }

    public Boolean validatePassword(){
        String val = loginpassword.getText().toString();
        if(val.isEmpty()){
            loginpassword.setError("Silahkan diisi");
            return  false;
        }else{
            loginpassword.setError(null);
            return true;
        }
    }

    public  void checkUser(){
        String userUsername = loginusername.getText().toString().trim();
        String userPassword = loginpassword.getText().toString().trim();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Mahasiswa");
        Query checkUserDatabase = reference.orderByChild("username").equalTo(userUsername);
        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot){
            if (snapshot.exists()) {
                loginusername.setError(null);
                String passwordFromDB = snapshot.child(userUsername).child("password").getValue(String.class);
                if (passwordFromDB.equals(userPassword)) {
                    loginusername.setError(null);
                    String usernameFromDB = snapshot.child(userUsername).child("username").getValue(String.class);
                    Intent i = new Intent(LoginMahasiswa.this, HomePageMhs.class);
                    i.putExtra("username", usernameFromDB);
                    i.putExtra("password", passwordFromDB);
                    startActivity(i);
                    finish();
                } else {
                    loginpassword.setError("Password salah");
                    loginpassword.requestFocus();
                }
            }

        }
            @Override
            public void onCancelled (@NonNull DatabaseError error){
            }
    });

    }
}
