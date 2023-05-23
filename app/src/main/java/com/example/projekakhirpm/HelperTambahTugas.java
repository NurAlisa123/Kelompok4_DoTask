package com.example.projekakhirpm;

public class HelperTambahTugas {
    String tugas, matkul, tenggat;

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getTenggat() {
        return tenggat;
    }

    public void setTenggat(String tenggat) {
        this.tenggat = tenggat;
    }

    public HelperTambahTugas(String tugas, String matkul, String tenggat) {
        this.tugas = tugas;
        this.matkul = matkul;
        this.tenggat = tenggat;
    }

    public void HelperTambahTugas() {
    }
}
