/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacelatihan;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class MultipleInterfaceMain {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        
        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");
        
        pakRektor.beriSertifikatMawapres(sarjanaCum);
        pakRektor.beriSertifikatMawapres(masterCum);
    }
}
