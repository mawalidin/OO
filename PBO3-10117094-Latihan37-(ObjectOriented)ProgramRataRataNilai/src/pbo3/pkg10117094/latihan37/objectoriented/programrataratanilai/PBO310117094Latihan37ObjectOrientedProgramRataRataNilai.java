/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan37.objectoriented.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Muhammad
 * NAMA         : Muhammad Walidin
 * NIM             : 10117094
 * KELAS        : PBO-3
 * Deskripsi     : Program ini berisi program untuk menampilkan program rata-rata
 * nilai
 */
public class PBO310117094Latihan37ObjectOrientedProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mah = new Mahasiswa();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mah.HitungTotal(mah.nilaiMhs, n);
         mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "+mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs,n));
        System.out.println("Developed by : Muhammad Walidin");

    }
    
}
