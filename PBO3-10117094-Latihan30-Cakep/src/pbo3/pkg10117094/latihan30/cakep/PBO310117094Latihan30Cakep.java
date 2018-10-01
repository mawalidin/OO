/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan30.cakep;

import java.util.Scanner;
import static pbo3.pkg10117094.latihan30.cakep.cakeperss.BLACK;
import static pbo3.pkg10117094.latihan30.cakep.cakeperss.BLUE;
import static pbo3.pkg10117094.latihan30.cakep.cakeperss.CYAN;
import static pbo3.pkg10117094.latihan30.cakep.cakeperss.GREEN;
import static pbo3.pkg10117094.latihan30.cakep.cakeperss.PURPLE;
import static pbo3.pkg10117094.latihan30.cakep.cakeperss.RED;
import static pbo3.pkg10117094.latihan30.cakep.cakeperss.RESET;
import static pbo3.pkg10117094.latihan30.cakep.cakeperss.YELLOW;

/**
 *
 * @author Muhammad
 */
public class PBO310117094Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String jawab;
        Scanner scn = new Scanner(System.in);
        
        System.out.print(RED+"Kamu "+RESET);
        System.out.print(GREEN+"ngerjain sendiri "+RESET);
        System.out.print(YELLOW+"latihan 17 sampe "+RESET);
        System.out.print(BLUE+"latihan 30 ini? \n"+RESET);
        System.out.print(BLUE+"Jawab "+RESET);
        System.out.print(RED+"(Yoi/Enggak) : "+RESET);
        jawab = scn.next();
        
        String jawaban = jawab.toUpperCase();
        if (jawaban.equals("YOI")) {
            System.out.print(RED+"\nCakep Bener. "+RESET);
            System.out.print(PURPLE+"Good Job \n"+RESET);
        }else{
            System.out.print(RED+"\nTetep cakep sih. "+RESET);
            System.out.print(CYAN+"\nSing penting paham konsep nya yee. "
                    +RESET);
            System.out.print(BLACK+"\nKeep the code works dude."+RESET);  
        }
    }
    
}
  
