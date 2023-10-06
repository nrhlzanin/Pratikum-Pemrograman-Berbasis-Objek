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
//Percobaan2
public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Budi", "Malang", 20, "Laki-laki", 2000000, 250000, 200000, " 2A", 100000);
        ST.tampilStaffTetap();
        
        StaffHarian SH = new StaffHarian("Indah", "Malang", 27, "Perempuan", 1000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }
}

//Percobaan 1
//public class Inheritance1 {
//    public static void main(String[] args) {
//        Manager M = new Manager();
//        M.nama = "Aditya";
//        M.alamat = "Jl. Pamungkas";
//        M.umur = 21;
//        M.jk = "Laki-laki";
//        M.gaji = 10000000;
//        M.tunjangan = 5000000;
//        
//        Staff S = new Staff();
//        S.nama = "Anin";
//        S.alamat = "Jl. Kalijaga";
//        S.umur = 21;
//        S.jk = "Perempuan";
//        S.gaji = 5000000;
//        S.lembur = 3000000;
//        S.potongan = 500000;
//        
//        M.tampilDataPegawai();
//        M.tampilDataManager();
//        S.tampilDataPegawai();
//        S.tampilDataStaff();
//    }
//}
