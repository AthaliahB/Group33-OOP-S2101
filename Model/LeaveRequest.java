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
public class LeaveRequest {
    
    private int leaveId;
    private Employee employee;
    private String leaveType;   // Sick, Vacation, Emergency
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String status;  // Pending, Approved, Rejected

    public LeaveRequest(int leaveId, Employee employee, String leaveType, LocalDate startDate, LocalDate endDate, String reason, String status) {
        this.leaveId = leaveId;
        this.employee = employee;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.status = status;
    }
    
    public int getLeaveId() {
        return leaveId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }
    
}
