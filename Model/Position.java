/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author athaliah
 */
public class Position {
    
    private String title;
    private double hourlyRate;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;

    public Position(String title, double hourlyRate, double riceSubsidy, double phoneAllowance, double clothingAllowance) {
        this.title = title;
        this.hourlyRate = hourlyRate;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
    }
    
    public String getTitle() {
        return title;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getTotalAllowance() {
        return riceSubsidy + phoneAllowance + clothingAllowance;
    }
}
