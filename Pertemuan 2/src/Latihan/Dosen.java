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
public class Dosen {
    private String nama;
    private String nip;

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNip(String nim) {
        this.nip = nip;
    }
    
    public String getNip() {
        return nip;
    }
    
    public void inputNilaiMahasiswa(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        mataKuliah.setNilai(nilai);
    }
}
