/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA         : Muhammad Walidin  
 * KELAS        : PBO-3
 * NIM          : 10117094
 * Deskripsi    : Program ini berisi program untuk menampilkan ejaan nama
 */
public class PBO310117094Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        
        
        //scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilan output
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = keyboard.next();
        
        int len = nama.length();
        char[] arrChar = new char[len];

        for (int no=0; no<len; no++){
        arrChar[no] = nama.charAt(no);
        System.out.println("Huruf ke- "+no+" : "+ arrChar[no]);
        }
    }
    
}
