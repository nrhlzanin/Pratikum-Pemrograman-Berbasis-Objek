/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author USER
 */
public class TestMahasiswa {
    public static void main (String args[]){
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinola 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        mhs2.nim = 102;
        mhs2.nama = "Hana";
        mhs2.alamat = "Jl. Violin 2A";
        mhs2.kelas = "1A";
        mhs2.tampilBiodata();
        
        mhs3.nim = 103;
        mhs3.nama = "Puspita";
        mhs3.alamat = "Jl. Vlanell 1A";
        mhs3.kelas = "1A";
        mhs3.tampilBiodata();
    }
}
