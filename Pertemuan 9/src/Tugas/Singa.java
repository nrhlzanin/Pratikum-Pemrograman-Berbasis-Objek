/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Singa extends Binatang implements IKarnivora {
    private String suara, warnaBulu;

    public Singa(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis \t\t: Karnivora");
        System.out.println("Makanan \t: Daging");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Nama \t\t: " + super.getNama());
        System.out.println("Jumlah Kaki \t: " + super.getJmlKaki());
    }

    public void displayData(){
        System.out.println("Suara \t\t: " + this.suara);
        System.out.println("Warna Bulu \t: " + this.warnaBulu);
    }
}
