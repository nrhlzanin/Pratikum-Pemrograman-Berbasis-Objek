/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Plant {
    public void doDestroy(Destroyable d) {
        if (d instanceof JumpingZombie) {
            JumpingZombie jz = (JumpingZombie) d;
            jz.heal();
            jz.destroyed();
        } else if (d instanceof WalkingZombie) {
            WalkingZombie wz = (WalkingZombie) d;
            wz.heal();
            wz.destroyed();
        } else {
            Barrier b = (Barrier) d;
            b.destroyed();
        }
    }
}
