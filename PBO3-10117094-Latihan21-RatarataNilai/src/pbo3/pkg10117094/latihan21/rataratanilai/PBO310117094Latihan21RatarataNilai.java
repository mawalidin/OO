/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA         : Muhammad Walidin
 * KELAS        : PBO-3
 * NIM          : 10117094
 * Deskripsi    : menghitung rata - rata nilai mahasiswa
 */
public class PBO310117094Latihan21RatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int n,jml,nilai[];
        float rata,jumlah=0;
        
        System.out.print("Masukkan Banyak Mahasiswa : ");
        n = input.nextInt();
        
        nilai = new int[n];
        
        for(int i=0; i <= n - 1; i++){
            System.out.print("Nilai Mahasiswa Ke-"+(i+1)+ ":");
            nilai[i] = input.nextInt();
            System.out.println();
        }
        
        for(int j=0; j<= n-1; j++){
            jumlah =jumlah + nilai[j];
        }
        rata = jumlah/n;
        
        System.out.println("Maka, Rata -Rata Nilainya Adalah :"+rata);
    }
    
}
