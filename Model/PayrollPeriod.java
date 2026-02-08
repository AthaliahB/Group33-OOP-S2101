/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author athaliah
 */
public class PayrollPeriod {
    
     private String periodName;        // e.g. " June 2024"
    private LocalDate startDate;
    private LocalDate endDate;

    public PayrollPeriod(String periodName, LocalDate startDate, LocalDate endDate) {
        this.periodName = periodName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
     public String getPeriodName() {
        return periodName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
