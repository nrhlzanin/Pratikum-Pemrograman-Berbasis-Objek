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
public class TugasInheritance {
    public static void main(String[] args) {
        Mac m = new Mac();
        m.merk = "Apple";
        m.kecProsesor = 2;
        m.sizeMemory = 16;
        m.jnsProsesor = "Intel Core i5";
        m.jnsBatrei = "Lithium-Ion";
        m.security = "Touch ID";
        
        Windows w = new Windows();
        w.merk = "Asus";
        w.kecProsesor = 2;
        w.sizeMemory = 32;
        w.jnsProsesor = "Intel Core i7";
        w.jnsBatrei = "Li-Polymer";
        w.fitur = "Gaming Mode";
                
        Pc p = new Pc();
        p.merk = "Dell";
        p.kecProsesor = 2;
        p.sizeMemory = 64;
        p.jnsProsesor = "Intel Core i9";
        p.ukuranMonitor = 24;
        
        m.tampilMac();
        System.out.println("");
        w.tampilWindows();
        System.out.println("");
        p.tampilPc();
        System.out.println("");
    }
}
