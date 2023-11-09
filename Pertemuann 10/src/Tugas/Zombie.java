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
public class Zombie implements Destroyable {
    protected int health;
    protected int level;
    
    public void heal() {

    }

    @Override
    public void destroyed() {

    }

    public String getZombieInfo() {
      String info = "Health \t= " + this.health;
      info += "\nLevel \t= " + this.level + "\n";
      return info;
    }
}
