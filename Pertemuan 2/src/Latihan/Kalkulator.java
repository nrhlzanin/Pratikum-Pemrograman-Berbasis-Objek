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
public class Kalkulator {
    private int operan1;
    private int operan2;
    private float hasil;
    
    public void tambah() {
        hasil = operan1 + operan2;
    }
    
    public void kurang() {
        hasil = operan1 - operan2;
    }
    
    public void kali() {
        hasil = operan1 * operan2;
    }
    
    public void bagi() {
        hasil = operan1 / operan2;
    }
    
    public float getHasil() {
        return hasil;
    }
    
    public static void main(String[] args) {
        Kalkulator k1 = new Kalkulator();
        
        k1.operan1 = 15;
        k1.operan2 = 3;
        
        k1.tambah();
        System.out.println("Hasil Penambahan \t: " + k1.getHasil());
        k1.kurang();
        System.out.println("Hasil Pengurangan \t: " + k1.getHasil());
        k1.kali();
        System.out.println("Hasil Perkalian \t: " + k1.getHasil());
        k1.bagi();
        System.out.println("Hasil Pembagian \t: " + k1.getHasil());
    }
}
