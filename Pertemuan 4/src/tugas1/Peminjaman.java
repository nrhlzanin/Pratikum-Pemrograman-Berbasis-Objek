/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nindy.relasiclass.tugas1;

import java.util.Date;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Peminjaman {
    private String nomorPeminjaman;
    private Anggota peminjam;
    private Buku[] buku;
    private Date tanggalPinjam;
    private Date tanggalKembali;

    public Peminjaman(String nomorPeminjaman, Anggota peminjam, Buku[] buku, Date tanggalPinjam, Date tanggalKembali) {
        this.nomorPeminjaman = nomorPeminjaman;
        this.peminjam = peminjam;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public String getNomorPeminjaman() {
        return nomorPeminjaman;
    }

    public void setNomorPeminjaman(String nomorPeminjaman) {
        this.nomorPeminjaman = nomorPeminjaman;
    }

    public Anggota getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }

    public Buku[] getBuku() {
        return buku;
    }

    public void setBuku(Buku[] buku) {
        this.buku = buku;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
    
    
    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nomor Peminjaman\t: ").append(nomorPeminjaman).append("\n");
        sb.append("\nData Peminjam\t\t:\n").append(peminjam.info()).append("\n");
        sb.append("\nData Buku yang Dipinjam\t:\n");
        for (Buku b : buku) {
            sb.append(b.info()).append("\n");
        }
        sb.append("\nTanggal Pinjam\t: ").append(tanggalPinjam).append("\n");
        sb.append("Tanggal Kembali\t: ").append(tanggalKembali).append("\n");
        return sb.toString();
    }
}
