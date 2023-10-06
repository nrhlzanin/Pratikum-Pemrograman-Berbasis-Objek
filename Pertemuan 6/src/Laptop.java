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
public class Laptop extends Komputer{
    public String jnsBatrei;
    
    Laptop(){
        
    }

    Laptop(String jnsBatrei, String merk, int kecProsesor, int SizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, SizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLaptop(){
        super.tampiData();
        System.out.println("Jenis Batrei \t\t: " + jnsBatrei);
    }
}
