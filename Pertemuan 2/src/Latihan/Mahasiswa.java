/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    private String nama;
    private String nim;

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNim() {
        return nim;
    }

    public void lihatNilaiMatakuliah(MataKuliah mataKuliah) {
        System.out.println("Mahasiswa \t\t: " + nama);
        System.out.println("NIM \t\t\t: " + nim);
        System.out.println("Mata kuliah \t\t: " + mataKuliah.getNama());
        System.out.println("Kode Mata kuliah \t: " + mataKuliah.getKodeMataKuliah());
        System.out.println("Nilai \t\t\t: " + mataKuliah.getNilai());
    }
}
