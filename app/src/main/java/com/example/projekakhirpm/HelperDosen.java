package com.example.projekakhirpm;

public class HelperDosen {
    String nama, username, password, nip;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNip() {
        return nip;
    }

    public HelperDosen(String nama, String username, String password, String nip) {
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.nip = nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    public HelperDosen(){

    }
}
