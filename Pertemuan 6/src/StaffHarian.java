/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Jobsheet6;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016 */
public class StaffHarian extends Staff {
    public int jmlJamKerja;
    
    StaffHarian(){
        
    }
    
    StaffHarian(String nama, String alamat, int umur, String jk, 
            int gaji, int lembur, int potongan, int jmlJamKerja){
       super(nama, alamat, umur, jk, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarian(){
        System.out.println("=======================Data Staff Harian=======================");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja = " + jmlJamKerja);
        System.out.println("Gaji Bersih \t= " + (gaji * jmlJamKerja + lembur - potongan));
    }
}
