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
public class Pc extends Komputer {
    public int ukuranMonitor;

    Pc() {
        
    }

    Pc(int ukuranMonitor, String merk, int kecProsesor, int SizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, SizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPc(){
        System.out.println("========================PC========================");
        super.tampiData();
        System.out.println("Ukuran Monitor \t\t: " + ukuranMonitor + "inc");
    }
}
