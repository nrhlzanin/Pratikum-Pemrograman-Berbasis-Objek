/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nindy.relasiclass.tugas1;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Buku {
    private String kode;
    private String judul;
    private String penulis;
    private int tahunTerbit;

    public Buku(String kode, String judul, String penulis, int tahunTerbit) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String info() {
        return "Kode \t\t: " + kode 
                + "\nJudul \t\t: " + judul 
                + "\nPenulis \t: " + penulis 
                + "\nTahun Terbit \t: " + tahunTerbit;
    }
}
