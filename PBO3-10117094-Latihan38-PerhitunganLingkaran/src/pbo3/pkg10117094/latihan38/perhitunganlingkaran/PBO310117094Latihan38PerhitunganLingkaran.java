/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan38.perhitunganlingkaran;

/**
 *
 * @author Muhammad
 * NAMA         : Muhammad Walidin
 * NIM             : 10117094
 * KELAS        : PBO-3
 * Deskripsi     : Program ini berisi program untuk menampilkan perhitungan
 * lingkaran
 */
public class PBO310117094Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}
