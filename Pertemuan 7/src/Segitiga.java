/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }
    
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC) {
        sudut = sisiA + sisiB + sisiC;
        return sudut;
    }
    
    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt (sisiA * sisiA + sisiB * sisiB);
        return c;
    }
    
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        
        int sudut1 = s.totalSudut(60);
        System.out.println("Total sudut segitiga A = 60 \t\t\t\t\t: " + sudut1);
        
        int sudut2 = s.totalSudut(60, 40);
        System.out.println("Total sudut segitiga A = 40 dan B = 40 \t\t\t\t: " + sudut2);
        
        int k1 = s.keliling(5, 6, 7);
        System.out.println("Keliling segitiga dengan sisi A= = 5, sisi B = 6, sisis C = 7 \t: " + k1);
    
        double k2 = s.keliling(3, 4);
        System.out.println("Keliling segita dengan sisi A = 3 dan sisi B = 4 \t\t: " + k2);
    }
}

