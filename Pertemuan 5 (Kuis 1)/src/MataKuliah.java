/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbokuis1;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class MataKuliah {
    private String kode;
    private String namaMk;
    private Nilai nilai;
    private int sks;
    
    MataKuliah(){
        this.kode = kode;
        this.namaMk = namaMk;
        this.nilai = nilai;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public void setNamaMk(String namaMk) {
        this.namaMk = namaMk;
    }

    public Nilai getNilai() {
        return nilai;
    }

    public void setNilai(Nilai nilai) {
        this.nilai = nilai;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
    
        public void tampilData() {
            System.out.printf("Kode Mata Kuliah \t: %s\n", kode);
            System.out.printf("Nama Mata Kuliah \t: %s\n", namaMk);
            System.out.printf("Nilai Mata Kuliah \t: %s\n", nilai.hitungNilaiTotal());
            System.out.printf("Jumlah sks Mata Kuliah \t: %d\n", sks);
            System.out.println("");
    }
}
