/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan17.programtunjangan;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA             : Muhammad Walidin
 * KELAS            : PBO-3 
 * NIM              : 10117094
 * Deskripsi        : Program ini berisi program untuk menampilkan program 
 * tunjangan
 */
public class PBO310117094Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String status;
        double gajiPokok, tunjangan, totalGaji;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=======Program Tunjangan=======");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiPokok = scanner.nextDouble();
        System.out.print("Status anda? (Menikah/Belum)    : " );
        status = scanner.next();
        
        if (status.equals("Menikah")||(status.equals("menikah"))){
            tunjangan = 0.35 * gajiPokok;} else {tunjangan = 0;}
        totalGaji = gajiPokok + tunjangan;
        
        System.out.println("=======Hasil Perhitungan Gaji Anda=======");
        System.out.println("Gaji Pokok\t: " +gajiPokok);
        System.out.println("Tunjangan\t: " +tunjangan);
        System.out.println("Total Gaji\t: " +totalGaji);
        System.out.println("(Developed by : Muhammad Walidin)");
    }
    
}
