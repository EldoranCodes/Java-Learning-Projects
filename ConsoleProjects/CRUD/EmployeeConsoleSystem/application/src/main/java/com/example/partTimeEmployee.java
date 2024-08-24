package com.example;

public class partTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    

    public partTimeEmployee(double hourlyRate, int hoursWorked){
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void sethourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public void setHourWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    } 
    public int getHoursWorkPerDay(){
        return hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; 
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "|EmployeeID:"+getID()+"|Name:"+getName()  +"|Department:"+getDepartment() +"|Hourly Rate:"+
        getHourlyRate()+"|WorkingHours:"+getHoursWorkPerDay();    
    }

}
