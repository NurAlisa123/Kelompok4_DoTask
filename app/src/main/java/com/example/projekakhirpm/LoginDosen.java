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

public class LoginDosen extends AppCompatActivity {
    ImageButton back;
    Button butregisDosen, butloginDosen;
    EditText loginusername, loginpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_dosen);

        loginusername = findViewById(R.id.UsernameDosen);
        loginpassword = findViewById(R.id.PasswordDosen);
        back = findViewById(R.id.imageButton);
        butregisDosen = findViewById(R.id.buttonRegisDosen);
        butloginDosen = findViewById(R.id.buttonLoginDosen);

        back.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (LoginDosen.this, WelcomePage.class);
                startActivity(i);
            }
        }));

        butregisDosen.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (LoginDosen.this, RegisterDosen.class);
                startActivity(i);
            }
        }));

        butloginDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (LoginDosen.this, HomePageDosen.class);
                startActivity(i);
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
                        Intent i = new Intent(LoginDosen.this, HomePageMhs.class);
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