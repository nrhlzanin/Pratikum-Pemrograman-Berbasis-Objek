/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nindy.relasiclass.percobaan2;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Mobil {
    private String merk;
    private int biaya;
    
    Mobil(){
        
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    
    public int getBiaya(){
        return biaya;
    }
    
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }    
}
