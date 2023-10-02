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
class MataKuliah {
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private double nilai;

    public void setNama(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public String getNama() {
        return namaMataKuliah;
    }
        
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
    public double getNilai() {
        return nilai;
    }
    
    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }
    
    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }
}

