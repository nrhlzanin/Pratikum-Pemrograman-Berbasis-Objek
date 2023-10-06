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
public class Staff extends Karyawan{
    public int lembur;
    public int potongan;
    
    Staff() {
    }
    
    Staff(String nama, String alamat, int umur, String jk, int gaji, int lembur, int potongan){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.jk = jk;
        this.gaji = gaji;
        this.lembur = lembur;
        this.potongan = potongan;         
    }
    
    public void tampilDataStaff() {
        System.out.println("Lembur \t\t= " + lembur);
        System.out.println("Potongan \t= " + potongan);
        System.out.println("Total GAJI \t= " + (gaji + lembur - potongan));
    }
}
