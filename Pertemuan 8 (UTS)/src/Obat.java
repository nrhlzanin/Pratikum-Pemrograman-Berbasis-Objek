/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Obat {
    private int harga;
    private String merk;
    
    Obat(int harga,String merk){
        this.harga = harga;
        this.merk = merk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getMerk() {
        return merk;
    }    
}
