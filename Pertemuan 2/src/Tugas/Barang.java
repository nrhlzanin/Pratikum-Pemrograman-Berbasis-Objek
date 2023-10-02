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
public class Barang {
   public String kode;
   public String namaBarang;
   public int hargaDasar;
   public float diskon;
   
   
   public int hitungHargaJual() {
       int hargaJual = (int) (hargaDasar - ((diskon * hargaDasar) / 100));
       return hargaJual;
   }
   
   public void tampilData() {
        System.out.println("Kode barang : " + kode);
        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Harga dasar : Rp. " + hargaDasar);
        System.out.println("Diskon : " + diskon + "%");
  }
   
  public static void main(String[] args) {
      Barang b1 = new Barang();
      
      b1.kode = "B001";
      b1.namaBarang = "Kursi";
      b1.hargaDasar = 100000;
      b1.diskon = 30;
      b1.tampilData();
      System.out.println("Harga jual : RP." + b1.hitungHargaJual());
  } 
}
