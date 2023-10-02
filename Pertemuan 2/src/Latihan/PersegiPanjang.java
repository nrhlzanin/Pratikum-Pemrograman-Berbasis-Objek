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
public class PersegiPanjang {
    private double panjang;
    private double lebar;
    
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    public double hitungKeliing() {
        return 2 * (panjang + lebar);
    }
    
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang();
        
        p1.panjang = 5;
        p1.lebar = 2;
        
        System.out.println("Luas Persegi Panjang \t\t: " + p1.hitungLuas());
        System.out.println("Keliling Persegi Panjang \t: " + p1.hitungKeliing());
    }
}
