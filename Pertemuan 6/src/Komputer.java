/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Jobsheet6;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;
    
    Komputer(){
        
    }

    Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    
    public void tampiData(){
        System.out.println("Merk Komputer \t\t: " + merk);
        System.out.println("Kecepatan Prosesor \t: " + kecProsesor + "GHz");
        System.out.println("Ukuran Memory \t\t: " + sizeMemory + "GB");
        System.out.println("Jenis Prosesor \t\t: " + jnsProsesor);
    }
}
