/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan57.vehicle;

/**
 *
 * @author Muhammad
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard() {
        this.myBoardLength = 0;
        setMyBrand("Ally Skate");
        setMyModel("Rocket");
        setMyBoardLength(54.5);

        System.out.println("\nSkateboard");
        System.out.println("Brand  : "+getMyBrand());
        System.out.println("Model  : "+getMyModel());
        System.out.println("Panjangnya Board: "+getMyBoardLength());
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }

    
}
