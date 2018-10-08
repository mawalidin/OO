/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan39.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author Muhammad
 */
public class PBO310117094Latihan39NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Scanner keyboard = new Scanner(System.in);
        
        int bykMah;
        String nama;
        System.out.println
        ("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        nama = keyboard.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMah = keyboard.nextInt();
        mhs1.inputNilai(mhs1.nilai, bykMah);
        mhs1.tampilBesarKecil(mhs1.nilai, bykMah);
        
        System.out.println("\n"+"Petugas : " + nama);

        
    }
    
}
