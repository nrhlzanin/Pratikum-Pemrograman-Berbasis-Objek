/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Main {
    public static void main(String[] args) {
        Obat o1 = new Obat(5000, "Panadol");
        Obat o2 = new Obat(2000, "Tolak Angin");
        
        Obat o[] = {o1, o2};
        
        Pasien p1 = new Pasien();
        p1.nama = "Paul";
        p1.obat = o;
        p1.print();
        
        PasienBpjs p2 = new PasienBpjs();
        p2.nama = "Pogba";
        p2.obat = o;
        p2.print();
    }
}
