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
public class Manager extends Karyawan{
    public int tunjangan;
    
    Manager(){
    }
    
    public void tampilDataManager() {
        System.out.println("Tunjangan \t= " + tunjangan);
        System.out.println("Total Gaji \t= " + (super.gaji + tunjangan));
    }
}
