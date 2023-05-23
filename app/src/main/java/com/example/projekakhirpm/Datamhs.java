package com.example.projekakhirpm;

public class Datamhs {
    String username;
    String password;
    String nama;
    String nipdosen;
    String nim;

    public Datamhs (String nama, String nim, String username, String password, String nipdosen){
        this.username = username;
        this.password = password;
        this.nim = nim;
        this.nama = nama;
        this.nipdosen = nipdosen;
    }
    public String getUserName() {
        return username;
    }
    public void setUserName(String username) {
        this.username = username;
    }
    public String getPassword() {return password;}
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {this.nim = nim;}
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {this.nama = nama;}
    public String getNipdosen() {
        return nipdosen;
    }
    public void setNipdosen(String nipdosen) {this.nipdosen = nipdosen;}
}



