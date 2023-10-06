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
public class Windows extends Laptop {
    public String fitur;

    Windows() {
        
    }

    Windows(String fitur, String jnsBatrei, String merk, int kecProsesor, int SizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, SizeMemory, jnsProsesor);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        System.out.println("======================Windows======================");
        super.tampilLaptop();
        System.out.println("Fitur \t\t\t: " + fitur);
    }
}
