/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Lingkaran {
    public double phi = 3.14;
    public double r;
    
    public double hitungLuas() {
        double luas = phi * r * r;
        return luas;
    }
    
    public double hitungKeliling() {
        double keliling = 2 * phi * r;
        return keliling;
    }
    
        public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(); 
        Lingkaran l2 = new Lingkaran();
        
        l1.r = 7;
        System.out.println("Luas lingkaran: " + l1.hitungLuas());
        System.out.println("Keliling lingkaran : " + l1.hitungKeliling());
        
        l2.r = 14;
        System.out.println("Luas lingkaran: " + l2.hitungLuas());
        System.out.println("Keliling lingkaran : " + l2.hitungKeliling());
    }
}
