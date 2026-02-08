/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author athaliah
 */
public class Payroll {
    
    private Employee employee;
    private PayrollPeriod payrollPeriod;
    private double grossPay;
    private double totalDeductions;
    private double netPay;

    public Payroll(Employee employee, PayrollPeriod payrollPeriod, double grossPay, double totalDeductions, double netPay) {
        this.employee = employee;
        this.payrollPeriod = payrollPeriod;
        this.grossPay = grossPay;
        this.totalDeductions = totalDeductions;
        this.netPay = netPay;
    }
    
    public Employee getEmployee() {
        return employee;
    }

    public PayrollPeriod getPayrollPeriod() {
        return payrollPeriod;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public double getNetPay() {
        return netPay;
    } 
}
