package com.example;

public class fulltimeEmployee extends Employee{
    private double baseSalary;
    private double bonus;

    public void setSalary(double salary){
        this.baseSalary = salary;
    }
    public double getSalary(){
        return baseSalary;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }

    @Override
    public double calculateSalary() {
        // TODO Auto-generated method stub
        
        return baseSalary + bonus;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub

        return "|EmployeeID:"+getID()+"|Name:"+getName()  +"|Department:"+getDepartment() +"|Base Salary:"+
        getSalary()+"|Bonus:"+getBonus();
        
    }

}
