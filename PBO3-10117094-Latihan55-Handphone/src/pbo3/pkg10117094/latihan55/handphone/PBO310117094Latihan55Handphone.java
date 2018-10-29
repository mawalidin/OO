/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan55.handphone;

/**
 *
 * @author Muhammad
 * NAMA            : Muhammad Walidin
 * NIM             : 10117094
 * KELAS           : PBO-3
 * Deskripsi       : Program ini berisi program untuk menampilkan informasi 
 * handphone
 */
public class PBO310117094Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.displayProduct();
        android.setKeyStore("234ibfd3840fo");
        System.out.println("Andriod Key Store : " + android.getKeyStore());

        BlackBerry blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackBerry.displayProduct();
        blackBerry.setPinBB("BHS249");
        System.out.println("PIN : " + blackBerry.getPinBB());

        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.displayProduct();
        windowsPhone.setWpKeyStore("UUUQIJWORJ");
        System.out.println("WP Key Store : " + windowsPhone.getWpKeyStore());

    }
    
}
