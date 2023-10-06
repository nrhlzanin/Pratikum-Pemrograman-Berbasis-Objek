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
public class Mac extends Laptop{
    public String security;

    Mac() {
        
    }

    Mac(String jnsBatrei, String merk, int kecProsesor, int SizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, SizeMemory, jnsProsesor);
        this.security = security;
    }
    
    public void tampilMac(){
        System.out.println("========================Mac========================");
        super.tampilLaptop();
        System.out.println("Security \t\t: " + security);
    }
}
