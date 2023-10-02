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
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Sarah");
        mhs1.setNim("101");
        
        Dosen d1 = new Dosen();
        d1.setNama("Welirang");
        d1.setNip("111");
        
        MataKuliah matkul1 = new MataKuliah();
        matkul1.setNama("Pemrograman Berbasis Objeck");
        matkul1.setKodeMataKuliah("M101");
        
        d1.inputNilaiMahasiswa(mhs1, matkul1, 85.0);
        
        mhs1.lihatNilaiMatakuliah(matkul1);
    }
}
