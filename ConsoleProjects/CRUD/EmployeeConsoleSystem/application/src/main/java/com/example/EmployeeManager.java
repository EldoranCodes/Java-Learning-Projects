package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    List<Employee> listofEmployees = new ArrayList<>();
    Scanner s = new Scanner(System.in);
   
   
    public void addEmployee() {
        System.out.println("1. Part Time");
        System.out.println("2. Full Time");
        System.out.print("Type of Employee: ");
        int n = s.nextInt();
        s.nextLine();

        System.out.println("Enter the employee's ID: ");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("Enter the employee's name: ");
        String name = s.nextLine();
        System.out.println("Enter the employee's department: ");
        String dep = s.nextLine();


        if (n==1){
            System.out.println("Enter the employee's hourly rate: ");
            double hr = s.nextDouble();
            s.nextLine();

            System.out.println("Enter the employee's working hour per day: ");
            int wh = s.nextInt();
            s.nextLine();

            partTimeEmployee e = new partTimeEmployee(hr, wh);
           
            e.setDepartment(dep);
            e.setID(id);
            e.setName(name);

            listofEmployees.add(e);

            System.out.println("A Part-time Employee Successfully Added! ");

        }else if (n == 2 ) {
            System.out.println("Enter the employee's Base Salary: ");
            double bs = s.nextDouble();
            s.nextLine();

            System.out.println("Enter the employee's bonus: ");
            double b = s.nextDouble();
            s.nextLine();

            fulltimeEmployee e = new fulltimeEmployee();
            e.setName(name);
            e.setID(id);
            e.setDepartment(dep);
            e.setSalary(bs);
            e.setBonus(b);

            listofEmployees.add(e);

            System.out.println("A Full-time Employee Successfully Added! ");

        } else {
            return;
        }   
    }

    public void removeEmployee(){
       Employee employeeForDeletion = null;
       
        System.out.println("Enter ID of the employee wanted to remove");
        int id = s.nextInt();
        s.nextLine();

        for (Employee e : listofEmployees) {
            if(e.getID() == id){
                employeeForDeletion = e;
            }
        }

        if (employeeForDeletion != null){   
            listofEmployees.remove(employeeForDeletion);
            System.out.println("Employee Successfully Deleted!");
        }else System.out.println("ID not found");
    }
  
    public void viewEmployee(){
    List<Employee> partimers = new ArrayList<>();
    List<Employee> fulltimers = new ArrayList<>();

        for (Employee e : listofEmployees) {
            //list first the fulltime
            if (e instanceof fulltimeEmployee){
               fulltimers.add(e);
            }else partimers.add(e);
        }
        
        System.out.println("--- FULL-TIME EMPLOYEE ---");

        if (fulltimers.isEmpty()){
            System.out.println("-EMPTY-");
        }else{
            for(Employee e : fulltimers){
                double baseSalary = ((fulltimeEmployee)e).getSalary();
                double bonus = ((fulltimeEmployee)e).getBonus();
                System.out.println(e.toString()+ " Base Salar = "+ baseSalary + " Bonus = "+ bonus);
            }
        }
        

        System.out.println("--- PART-TIME EMPLOYEE ---");

        //check if partimers is empty
        if (partimers.isEmpty()){
            System.out.println("EMPTY");

        }else {
            for  (Employee e :  partimers){
                //cast  the employee object to partimeEmployee to use the getters and setters
                double hourlyrate = ((partTimeEmployee)e).getHourlyRate();
                int hoursWorked = ((partTimeEmployee)e).getHoursWorkPerDay();
                System.out.println(e.toString() + " Hourly rate = "+ hourlyrate + " working hours = "+ hoursWorked); 
            }
        }

        System.out.println();
        System.out.println();
        
    }
    

    public void FindEmployeeByID(){
        System.out.print("Enter an Employee ID: ");
        int id = s.nextInt();
        s.nextLine();
        
       for (Employee e : listofEmployees) {
            if (e.getID() == id){
                System.out.println(e);
                return;
            }
       }
       System.out.println("Employee not found!");
    }

    public boolean isIdExist(int id){
        for (Employee e : listofEmployees) {
            if(e.getID() == id){
                return true;
            }
        }
        return false;
    }
}
