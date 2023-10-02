/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nindy.relasiclass.percobaan1;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    Laptop(){
        
    }
    
    Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setProc(Processor proc){
        this.proc = proc;
    }
    
    public Processor getProc(){
        return proc;
    }
    
    public void info(){
        System.out.println("Merek Laptop = " + merk);
        proc.info();
    }

}
