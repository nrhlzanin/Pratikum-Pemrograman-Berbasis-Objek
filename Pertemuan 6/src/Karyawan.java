/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Jobsheet6;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Karyawan {
    public String nama;
    public String alamat;
    public int umur;
    public String jk;
    public int gaji;
    
    Karyawan() {
    }
    
    
    Karyawan(String nama, String alamat, int umur, String jk, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.jk = jk;
        this.gaji = gaji;
    }
    
    public void tampilDataPegawai(){
        System.out.println("");
        System.out.println("Nama \t\t= " + nama);
        System.out.println("Alamat \t\t= " + alamat);
        System.out.println("Umur \t\t= " + umur);
        System.out.println("Jenis Kelamin \t= " + jk);
        System.out.println("Gaji \t\t= " + gaji);
    }
}
