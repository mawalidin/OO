/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan61.bangunruang;

/**
 *
 * @author Muhammad
 */
public class Kerucut extends BangunRuang{
    private double r;
    private double h;

    private double volume;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    @Override
    public double hitungVolume() {
        this.volume = (1 * Math.PI * Math.pow(r, 2) * h)/3;
        return this.volume;
    }
}
