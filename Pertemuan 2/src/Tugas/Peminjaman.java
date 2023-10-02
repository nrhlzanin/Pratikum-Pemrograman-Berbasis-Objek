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
public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int hargaBayar;
    
    public int hitungHarga(int lamaSewa) {
        int hitungHarga = lamaSewa * hargaBayar;
        return hitungHarga;
    }
    
    public void tampilData() {
        System.out.println("ID: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
    }
    
    public static void main(String[] args) {
        Peminjaman p1 = new Peminjaman();
        Peminjaman p2 = new Peminjaman();
        
        p1.id = "001";
        p1.namaMember = "Laras";
        p1.namaGame = "Game A";
        p1.hargaBayar = 12000;
        p1.tampilData();
        System.out.println("Harga yang harus dibayar : " + p1.hitungHarga(2));
        System.out.println();
        
        p2.id = "002";
        p2.namaMember = "Hana";
        p2.namaGame = "Game B";
        p2.hargaBayar = 10000;
        p2.tampilData();
        System.out.println("Harga yang harus dibayar : " + p2.hitungHarga(3));
       
    }
}
