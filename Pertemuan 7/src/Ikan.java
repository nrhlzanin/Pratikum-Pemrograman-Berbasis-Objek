/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Ikan {
    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}

class Piranda extends Ikan {
    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }
}

class Fish {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Ikan();
        a.swim();
        b.swim();
    }
}
