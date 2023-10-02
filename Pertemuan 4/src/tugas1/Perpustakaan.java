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
public class Perpustakaan {
    private final Peminjaman[] daftarPeminjaman;
    private final Anggota[] daftarAnggota;
    private final Buku[] daftarBuku;
    private int jumlahPeminjaman;
    private int jumlahAnggota;
    private int jumlahBuku;

    public Perpustakaan(int maxPeminjaman, int maxAnggota, int maxBuku) {
        daftarPeminjaman = new Peminjaman[maxPeminjaman];
        daftarAnggota = new Anggota[maxAnggota];
        daftarBuku = new Buku[maxBuku];
        jumlahPeminjaman = 0;
        jumlahAnggota = 0;
        jumlahBuku = 0;
    }

    public void tambahPeminjaman(Peminjaman peminjaman) {
        if (jumlahPeminjaman < daftarPeminjaman.length) {
            daftarPeminjaman[jumlahPeminjaman] = peminjaman;
            jumlahPeminjaman++;
            System.out.println("Peminjaman berhasil ditambahkan.");
        } else {
            System.out.println("Maaf, kapasitas peminjaman penuh.");
        }
    }

    public void tambahAnggota(Anggota anggota) {
        if (jumlahAnggota < daftarAnggota.length) {
            daftarAnggota[jumlahAnggota] = anggota;
            jumlahAnggota++;
            System.out.println("Anggota berhasil ditambahkan.");
        } else {
            System.out.println("Maaf, kapasitas anggota penuh.");
        }
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku berhasil ditambahkan.");
        } else {
            System.out.println("Maaf, kapasitas buku penuh.");
        }
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------Daftar Anggota------------------\n");
        for (int i = 0; i < jumlahAnggota; i++) {
            sb.append(daftarAnggota[i].info()).append("\n");
        }
        sb.append("\n------------------Daftar Buku------------------\n");
        for (int i = 0; i < jumlahBuku; i++) {
            sb.append(daftarBuku[i].info()).append("\n");
        }
        sb.append("\n------------------Daftar Peminjaman------------------\n");
        for (int i = 0; i < jumlahPeminjaman; i++) {
            sb.append(daftarPeminjaman[i].info()).append("\n");
        }
        return sb.toString();
    }
}
