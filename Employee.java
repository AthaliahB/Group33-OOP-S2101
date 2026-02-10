/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author athaliah
 */
public abstract class Employee  implements PayrollCalculable {
// PRIVATE ATTRIBUTES (Encapsulation)
    private String employeeNumber;
    private String lastName;
    private String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String status;
    private String position;

    private double basicSalary;
    private double hourlyRate; 
    private double allowance;

//CONSTRUCTOR 

    public Employee(String employeeNumber, String lastName, String firstName, String birthday, String address, String phoneNumber, String status, String position, 
            double basicSalary, double hourlyRate, double allowance, int userId, String username, String role) 
    {

        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.position = position;
        this.basicSalary = basicSalary;
        this.hourlyRate = hourlyRate;
        this.allowance = allowance;
    }

//GETTERS
   
        public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPosition() {
        return position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}       

//SETTERS
public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
}

public void setLastname(String lastName) {
    this.lastName = lastName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public void setBirthday(String birthday) {
    this.birthday = birthday;
}

public void setAddress(String address) {
    this.address = address;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public void setStatus(String status) {
    this.status = status;
}

public void setPosition(String position) {
    this.position = position;
}

public void setBasicSalary(double basicSalary) {
    this.basicSalary = basicSalary;
}

public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
}

public void setAllowance(double allowance) {
    this.allowance = allowance;
}