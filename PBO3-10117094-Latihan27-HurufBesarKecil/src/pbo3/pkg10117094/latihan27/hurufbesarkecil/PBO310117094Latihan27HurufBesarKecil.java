/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA             : Muhammad Walidin
 * KELAS            : PBO-3 
 * NIM              : 10117094
 * Deskripsi        : Program ini berisi program untuk menampilkan program 
 * huruf besar menjadi kecil
 */
public class PBO310117094Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        
        
        
        Scanner name = new Scanner(System.in);
        
        System.out.printf("Masukkan Kalimat :");
        kalimat = name.nextLine();
               
        String kalimat1 = kalimat.toUpperCase();
        String kalimat2 = kalimat1.toLowerCase();
                
        System.out.println("====Hasil Formating====");
        System.out.println("Huruf Besar :"+kalimat1 );
        System.out.println("Huruf Kecil :"+kalimat2 );
      
    }
    
}
