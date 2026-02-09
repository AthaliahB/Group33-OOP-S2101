/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author athaliah
 */

  public class HR extends Employee implements Operations, HROperations {


    public HR(String employeeNumber, String lastName, String firstName, String birthday, String address,
            String phoneNumber, String status, String position, double basicSalary, double hourlyRate, 
            double allowance, int userId, String username, String role) {
        super(employeeNumber, lastName, firstName, birthday, address, phoneNumber, status, position, basicSalary, hourlyRate, allowance, userId, username, role);
    }
    
    public String getDepartment() {
        return "HR Department";
    }

    @Override
    public double calculateGrossSalary() {
        return getBasicSalary();
    }

    @Override
    public double calculateDeductions() {
        return getBasicSalary() * 0.10;
    }

    @Override
    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateDeductions();
    }

    // CRUD
    public void create() { }
    public void update() { }
    public void delete() { }
    public void view() { }

    // HR Operations
    public void approveLeave() { }
    public void rejectLeave() { }
    public void viewEmployeeRecords() { }
}

