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
public class MainTugas {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan(50, 100, 500);

        // Menambahkan anggota
        Anggota a = new Anggota("A001", "John Doe", "Jl. ABC No. 123", "081234567890");
        perpustakaan.tambahAnggota(a);

        // Menambahkan buku
        Buku b = new Buku("B001", "Java Programming", "Alice Johnson", 2021);
        perpustakaan.tambahBuku(b);

        // Menambahkan peminjaman
        Buku[] bukuPeminjaman = {b};
        Peminjaman peminjaman1 = new Peminjaman("P001", a, bukuPeminjaman, new Date(), new Date());
        perpustakaan.tambahPeminjaman(peminjaman1);

        // Menampilkan informasi perpustakaan
        System.out.println(perpustakaan.info());
    }
}
