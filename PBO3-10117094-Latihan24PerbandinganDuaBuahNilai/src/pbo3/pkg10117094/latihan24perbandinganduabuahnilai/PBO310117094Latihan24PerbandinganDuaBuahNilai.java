/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan24perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA         : Muhammad Walidin  
 * KELAS        : PBO-3
 * NIM          : 10117094
 * Deskripsi    : Program ini menapilkan perbandingan nilai   
 */
public class PBO310117094Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        deklarasi variabel
        int n1;
        int n2;
        String lagi; //variabel pengontrol aktifitas
        Scanner scn = new Scanner(System.in);
        
        System.out.println("========Program Perbandingan Nilai========");
//        menggunakan looping do while
        do {            
            System.out.print("Masukkan nilai pertama : ");
            n1 = scn.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            n2 = scn.nextInt();
            
//            rumus perbandingan
            if (n1 > n2) {
                System.out.println("Hasil : "+n1+" Lebih besar dari "+n2+"\n");
            }else if(n1 < n2){
                System.out.println("Hasil : "+n1+" Lebih kecil dari "+n2+"\n");
            }else
                System.out.println("Hasil : "+n1+" sama dengan "+n2+"\n");
                
//            ketikkan "Tidak" bila ingin berhenti aktifitas
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            lagi = scn.next();
            
            System.out.println("");//memberi jarak satu baris
        } while (!lagi.equals("Tidak"));
    }
    
}
