/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA         : Muhammad Walidin
 * KELAS        : PBO-3
 * NIM          : 10117094
 * Deskripsi    : Program ini berisi program untuk menampilkan 
 * hasil perhitungan lingkaran
 */
public class PBO310117094Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double jari;
        double keliling;
        double luas;
        String n;
        double phi = 3.14;
        boolean ulang = true;
                
        
        Scanner scanner = new Scanner(System.in);
        
        while(ulang==true){
        
        System.out.println("=======Perhitungan Lingkaran========");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        n = scanner.next();
        
        if(n.matches("[0-9]*")){
        double akhir =Double.parseDouble(n);
        
            jari = akhir / 2;
            luas = phi*(Math.pow(jari,2));
            keliling = 2 * phi * jari;
        
        
        System.out.println("=======Hasil Perhitungan Lingkaran========");
        System.out.println("Jari - Jari Lingkaran = " +jari+ "cm");
        System.out.println("Luas Lingkaran        =" +luas+"cm");
        System.out.println("Keliling Lingkaran    =" +keliling+ "cm");
        ulang = false;
        
        
        }else
        
            System.out.println("Nilai Diameter Tidak Sesuai");
        }
    }
    
}
