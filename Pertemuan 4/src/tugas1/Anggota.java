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
public class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota(String idAnggota, String nama, String alamat, String telepon) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String info() {
        return "ID Anggota\t: " + idAnggota 
                + "\nNama\t\t: " + nama 
                + "\nAlamat\t\t: " + alamat 
                + "\nTelepon\t\t: " + telepon;
    }
}
