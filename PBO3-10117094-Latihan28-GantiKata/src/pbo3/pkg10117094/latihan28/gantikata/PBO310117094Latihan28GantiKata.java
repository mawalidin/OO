/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA         : Muhammad Walidin
 * KELAS        : PBO-3
 * NIM          : 10117094
 * Deskripsi    : Program ini berisi program untuk menampilkan ganti kata
 */
public class PBO310117094Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        deklarasi Variabel
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String jadiKata;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Program Ganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scn.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scn.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scn.next();
        
        //proses pergantian kata dengan kata yang lain
        kalimatBaru =  (kalimatAwal).replaceAll(gantiKata, jadiKata);
        
        //menampilkan hasil perubahan kata
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
        
        
        
        
    }
    
}
