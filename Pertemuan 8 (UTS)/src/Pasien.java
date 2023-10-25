/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Pasien {
    public String nama;
    public Obat[] obat;
    
    public int hitungBiaya() {
        int totalBiaya = 0;
        for (Obat o : obat) {
            totalBiaya += o.getHarga();
        }
        return totalBiaya;
    }
    
    public void print() {
        System.out.println("Nama Pasien: " + nama);
        System.out.println("Total Biaya Obat: " + hitungBiaya());
    }
}
