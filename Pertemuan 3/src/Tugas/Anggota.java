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
public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public void setNoKTP(String noKtp) {
        this.noKtp = noKtp;
    }
    
    public String getNomorKTP() {
        return noKtp;
    }
   
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setLimitPinjaman(int limitPinjaman) {
        this.limitPinjaman = limitPinjaman;
    }
    
    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double jumlah) {
        if (jumlah <= limitPinjaman - jumlahPinjaman) {
            jumlahPinjaman += jumlah;
        } else {
            System.out.println("Maaf, Jumlah peminjaman melebihi limit.");
        }
    }
    
//    public void angsur(double jumlah) {
//        if (jumlah <= jumlahPinjaman) {
//            jumlahPinjaman -= jumlah;
//        } else {
//            System.out.println("Maaf, Jumlah angsuran melebihi jumlah pinjaman.");
//        }
//    }
    
    public void angsur(double jumlah) {
        double minimalAngsuran = 0.1 * jumlahPinjaman; // 10% dari jumlah pinjaman saat ini
        if (jumlah >= minimalAngsuran) {
            jumlahPinjaman -= jumlah;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        }
    }
}
