/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan36.objectoriented.targetsaldotabungan;

/**
 *
 * @author Muhammad
 * NAMA         : Muhammad Walidin
 * NIM             : 10117094
 * KELAS        : PBO-3
 * Deskripsi     : Program ini berisi program untuk menampilkan target
 * saldo tabungan
 */
public class PBO310117094Latihan36ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tab = new Tabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo,saldoTarget);
    }
    
}
