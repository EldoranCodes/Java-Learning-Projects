package com.example;

public abstract class Employee{
    private int employeeID;
    private String name;
    private String department;
    
    // abstract methods
    public abstract double calculateSalary();
    public abstract  String toString();


    //setters and getters
    public void setID(int newID){
        this.employeeID = newID;
    }

    public int getID(){
        return employeeID;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }
    
    public void setDepartment(String newDepartment){
        this.department = newDepartment;
    }
    public String getDepartment(){
        return department;
    }
  


}
