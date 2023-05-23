package com.example.projekakhirpm;

public class HelperMhs {

    String nama,nim,username,password,nip;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
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

    public HelperMhs(String nama, String nim, String username, String password, String nip) {
        this.nama = nama;
        this.nim = nim;
        this.username = username;
        this.password = password;
        this.nip = nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    public  HelperMhs(){

    }
}

