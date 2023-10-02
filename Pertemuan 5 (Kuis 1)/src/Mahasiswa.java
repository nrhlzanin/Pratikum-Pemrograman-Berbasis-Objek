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
public class Mahasiswa {
    private String nim;
    private String nama;
    private MataKuliah mk[];

    Mahasiswa(){
        this.nim = nim;
        this.nama = nama;
        this.mk = mk;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public MataKuliah[] getMk() {
        return mk;
    }

    public void setMk(MataKuliah[] mk) {
        this.mk = mk;
    }
    
    public double hitungNilaiRataRata(){
        double totalNilai = 0;
        int totalSks = 0;

        for (MataKuliah mataKuliah : mk) {
            if (mataKuliah != null) {
                totalNilai += mataKuliah.getNilai().hitungNilaiTotal() * mataKuliah.getSks();
                totalSks += mataKuliah.getSks();
            }
        }

        if (totalSks == 0) {
            return 0.0;
        }

        return totalNilai / totalSks;
    }
    
    public void tampilData(){
        System.out.println("-------------------------Data Mahasiswa-------------------------");
        System.out.printf("NIM \t\t\t\t= %s\n", nim);
        System.out.printf("Nama \t\t\t\t= %s\n", nama);
        System.out.println("Total Nilai per Mata Kuliah \t= ");
        System.out.println("");
        
        for (MataKuliah mk : this.mk) {
            System.out.println("Kode Mata Kuliah \t: " + mk.getKode());
            System.out.println("Nama Mata Kuliah \t: " + mk.getNamaMk());
            System.out.println("SKS \t\t\t: " + mk.getSks());
            System.out.println("Nilai \t\t\t: " + mk.getNilai().hitungNilaiTotal());
            System.out.println("");
        }
    }

}
