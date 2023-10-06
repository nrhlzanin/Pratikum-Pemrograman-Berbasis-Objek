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
public class StaffTetap extends Staff{
    public String golongan;
    public int asuransi;
    
    StaffTetap(){
        
    }
    
    StaffTetap(String nama, String alamat, int umur, String jk, 
            int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama, alamat, umur, jk, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void tampilStaffTetap(){
        System.out.println("=======================Data Staff Tetap=======================");
        super.tampilDataStaff();
        System.out.println("Golongan \t= " + golongan);
        System.out.println("Jumlah Asuransi = " + asuransi);
        System.out.println("Gaji Bersih \t= " + (gaji + lembur - potongan - asuransi));
    }
}
