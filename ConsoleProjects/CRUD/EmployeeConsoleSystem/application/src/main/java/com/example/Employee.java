package com.example;

public abstract class Employee{
    private int employeeID;
    private String name;
    private String department;
    

    public abstract double calculateSalary();

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
    @Override
    public String toString(){
        return "ID = "+ employeeID + " Name = "+name + " Department = "+ department;
         
    }


}
