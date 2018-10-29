/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan61.bangunruang;

/**
 *
 * @author Muhammad
 * NAMA  : Muhammad Walidin 
 * NIM   : 10117094    
 * KELAS : PBO-3
 * Deskripsi : Program ini berisi program untuk menampilkan bangun ruang yaitu
 * bola,tabung dan kerucut
 */
public class PBO310117094Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();
        
        b.setR(7);
        System.out.println("Volume Bola : " + Math.ceil(b.hitungVolume()));
        
        t.setH(21);
        t.setR(10);
        System.out.println("Volume Tabung : " + Math.ceil(t.hitungVolume()));
        
        k.setR(14);
        k.setH(9);
        System.out.println("Volume Kerucut : " + Math.ceil(k.hitungVolume()));
    }
    
}
