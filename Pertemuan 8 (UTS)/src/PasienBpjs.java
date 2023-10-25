/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class PasienBpjs extends Pasien{

    @Override
    public int hitungBiaya() {
        int totalBiaya = 0;
        for (Obat o : obat) {
            int hargaObat = o.getHarga();
            if (hargaObat >= 5000) {
                double potongan = hargaObat * 0.025;
                hargaObat -= potongan;
            }
            totalBiaya += (int) hargaObat;
        }
        return totalBiaya;
    }
}
