/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan29.warna.kepribadian;

import java.util.Scanner;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.BLACK;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.BLUE;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.BLUE2;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.BLUE_BACKGROUND;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.GREEN;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.GREEN_BACKGROUND;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.PURPLE;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.PURPLE_BACKGROUND;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.RED;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.RED_BACKGROUND;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.RESET;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.WHITE;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.YELLOW;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.YELLOW_BACKGROUND;
import static pbo3.pkg10117094.latihan29.warna.kepribadian.Warna.hasilTest;

/**
 *
 * @author 
 */
public class PBO310117094Latihan29WarnaKepribadian{
  
   
    public static void main(String[] args) {
        // TODO code application logic here
        String warnaMu;
        String namaMu;
        Scanner scn = new Scanner(System.in);
        
        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");
        
        System.out.println(RED + "YUK " + GREEN + ("CEK ") + YELLOW 
                + ("KEPRIBADIANMU ") + BLUE2 + ("DARI ") + PURPLE + 
                ("WARNA ") + BLUE + ("FAVORITMU\n")+RESET);
        
        System.out.println(RED_BACKGROUND + WHITE + "\tMERAH\t\t");
        System.out.println(GREEN_BACKGROUND + WHITE + "\tHIJAU\t\t");
        System.out.println(YELLOW_BACKGROUND + WHITE + "\tKUNING\t\t");
        System.out.println(BLUE_BACKGROUND + WHITE + "\tBIRU\t\t");
        System.out.println(PURPLE_BACKGROUND + WHITE + "\tUNGU\t\t\n" + RESET);
        
        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");
        warnaMu = scn.next();
        System.out.print(BLACK + "NAMA KAMU : ");
        namaMu = scn.next();
        
        
        
         
         System.out.println("===HASIL TEST KEPRIBADIAN "+namaMu+("==="));
         System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namaMu.toUpperCase()+"====");
        hasilTest(warnaMu);
    }
    
}
