/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan62.livingthing;

/**
 *
 * @author Muhammad
 * NAMA            : Muhammad Walidin
 * NIM             : 10117094
 * KELAS           : PBO-3
 * Deskripsi       : Program ini berisi program untuk menampilkan informasi
 * tentang makhluk hidup
 */
public class PBO310117094Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Muhammad Walidin");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        
    }
    
}
