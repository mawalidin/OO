/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan31.objectoriented.perkenalanmahasiswa;

/**
 *
 * @author Muhammad
 * NAMA         : Muhammad Walidin
 * NIM             : 10117094
 * KELAS        : PBO-3
 * Deskripsi     : Program ini berisi program untuk menampilkan perkenalan 
 * mahasiswa
 */
public class PBO310117094Latihan31ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("10110269");
        mhs1.setNama("Rizki Adam Kurniawan");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim("10110270");
        mhs2.setNama("Indra Tiola");
        mhs2.perkenalkanDiri();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim("10110271");
        mhs3.setNama("Robi Tanzil Ganefi");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNim("10110272");
        mhs4.setNama("Muhammad Nur Awaluddin");
        mhs4.perkenalkanDiri();

    }
    
}
