/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author athaliah
 */
public class Deduction {
    
    private double sss;
    private double philHealth;
    private double pagIbig;
    private double tax;

    public Deduction(double sss, double philHealth, double pagIbig, double tax) {
        this.sss = sss;
        this.philHealth = philHealth;
        this.pagIbig = pagIbig;
        this.tax = tax;
    }
    
     public double getTotalDeductions() {
        return sss + philHealth + pagIbig + tax;
    }
    
}
