/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan35.objectoriented.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Muhammad
 * NAMA         : Muhammad Walidin
 * NIM             : 10117094
 * KELAS        : PBO-3
 * Deskripsi     : Program ini berisi program untuk menampilkan program
 * tunjangan
 */
public class PBO310117094Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scn.next();

        kar.HasilHitung(kar.status,kar.gajiPokok);

    }

    
}
