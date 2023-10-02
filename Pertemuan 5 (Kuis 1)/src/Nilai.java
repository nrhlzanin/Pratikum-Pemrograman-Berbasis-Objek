/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbokuis1;

/*
 * Nama : Nurhaliza Anindya Putri
 * NIM  : 2241720016
 */
public class Nilai {
    private double q1;
    private double q2;
    private double uts;
    private double uas;
    private double tugas;
    
    Nilai(){
        this.q1 = q1;
        this.q2 = q2;
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    public double getQ1() {
        return q1;
    }

    public void setQ1(double q1) {
        this.q1 = q1;
    }

    public double getQ2() {
        return q2;
    }

    public void setQ2(double q2) {
        this.q2 = q2;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }


    public double getUas() {
        return uas;
    }


    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }
    
    public double hitungNilaiTotal(){
        return 0.15 * q1 + 0.15 * q2 + 0.25 * uts + 0.35 * uas + 0.1 * tugas;  
    }
    
    public void tampilData(){
        System.out.printf("Nilai Q1 \t\t: %s\n", q1);
        System.out.printf("Nilai Q2 \t\t: %.2f\n", q2);
        System.out.printf("Nilai UTS \t\t: %s\n", uts);
        System.out.printf("Nilai UAS \t\t: %.2f\n", uas);
        System.out.printf("Nilai TUGAS \t\t: %s\n", tugas);
    }
}
