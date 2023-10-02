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
public class MainNilai {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Raditya");
        mhs.setNim("12345");
        
        Nilai n1 = new Nilai();
        n1.setQ1(90.0);
        n1.setQ2(85.0);
        n1.setUts(87.0);
        n1.setUas(95.0);
        n1.setTugas(80.0);
        
        Nilai n2 = new Nilai();
        n2.setQ1(80.0);
        n2.setQ2(85.0);
        n2.setUts(77.0);
        n2.setUas(85.0);
        n2.setTugas(90.0);
        
        Nilai[] n = new Nilai[2];
        n[0] = n1;
        n[1] = n2;
        
        MataKuliah mk1 = new MataKuliah();
        mk1.setKode("MK001");
        mk1.setNamaMk("Pemrograman Berbasis Objek");
        mk1.setNilai(n1);
        mk1.setSks(4);
        
        MataKuliah mk2 = new MataKuliah();
        mk2.setKode("MK002");
        mk2.setNamaMk("Basis Data Lanjut");
        mk2.setNilai(n2);
        mk2.setSks(4);
        
        MataKuliah[] mk = new MataKuliah[2];
        mk[0] = mk1;
        mk[1] = mk2;
        
        mhs.setMk(mk);
        mhs.tampilData();
        
        System.out.println("--------------------------Detail Nilai--------------------------");
        for (MataKuliah mataKuliah : mhs.getMk()) {
            if (mataKuliah != null) {
                mataKuliah.tampilData();
                mataKuliah.getNilai().tampilData();
                System.out.println("");
            }
        }
    }
}
