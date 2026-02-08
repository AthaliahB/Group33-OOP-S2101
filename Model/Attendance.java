/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author athaliah
 */
public class Attendance {
    
    private int daysWorked;
    private int overtimeHours;
    private int lateMinutes;

    public Attendance(int daysWorked, int overtimeHours, int lateMinutes) {
        this.daysWorked = daysWorked;
        this.overtimeHours = overtimeHours;
        this.lateMinutes = lateMinutes;
    }
    
     public int getDaysWorked() {
        return daysWorked;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public int getLateMinutes() {
        return lateMinutes;
    }
}
