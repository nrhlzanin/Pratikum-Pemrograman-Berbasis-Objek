/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nindy.relasiclass.percobaan4;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        
        Penumpang b = new Penumpang("67890", "Budi");
        gerbong.setPenumpang(b, 1);

        System.out.println(gerbong.info());
    }
}
 