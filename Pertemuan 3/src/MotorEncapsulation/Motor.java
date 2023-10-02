/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotorEncapsulation;

/**
 *
 * @author USER
 */
public class Motor {
//    public int kecepatan = 0;
//    public boolean kontakOn = false;
    
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn= true;
    }

    public void matikanMesin(){
        kontakOn= false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        if(kontakOn == true && kecepatan < 100){
            kecepatan += 5;
        } else if (kontakOn == false) {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off!\n");
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off!\n");
        }
    }
    
    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
            if (kecepatan < 0) {
            kecepatan = 0;
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off!\n");
        }
    }
    
    public void printStatus(){
    if(kontakOn == true){
        System.out.println("Kontak On");
    } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
