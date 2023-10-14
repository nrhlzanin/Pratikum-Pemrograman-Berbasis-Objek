/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class MainStereotype {
    public static void main(String[] args) {
        StereortypeManusia m1 = new StereotypeDosen();
        StereortypeManusia m2 = new StereotypeMahasiswa();
        
        m1.makan();
        m1.bernafas();
        System.out.println("");
        
        m2.makan();
        m2.bernafas();
        
    }
}
