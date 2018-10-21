/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author Muhammad
 * NAMA            : Muhammad Walidin
 * NIM             : 10117094
 * KELAS           : PBO-3
 * Deskripsi       : Program ini berisi program untuk menampilkan nilai mahasiswa
 */
public class PBO310117094Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        Index objI = new Index();
        
        System.out.print("QUIZ : ");
        objI.setQuis(sc1.nextDouble());
        System.out.print("UTS : ");
        objI.setUts(sc2.nextDouble());
        System.out.print("UAS : ");
        objI.setUas(sc3.nextDouble());
        
        System.out.println("");
        System.out.println("Nilai Akhir = "+objI.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
        

    }
    
}
