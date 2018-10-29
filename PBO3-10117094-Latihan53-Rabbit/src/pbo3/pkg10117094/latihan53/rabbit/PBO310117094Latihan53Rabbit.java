/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan53.rabbit;

/**
 *
 * @author Muhammad
 * NAMA            : Muhammad Walidin
 * NIM             : 10117094
 * KELAS           : PBO-3
 * Deskripsi       : Program ini berisi program untuk menampilkan informasi si
 * rabbit
 */
public class PBO310117094Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter",false, "grass", 4, "grey" );
        System.out.println("Hello, His name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian? "+rabbit.isVegetarian());
        System.out.println(rabbit.getName()+" eats "+rabbit.getEats());
        System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs.");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());

    }
    
}
