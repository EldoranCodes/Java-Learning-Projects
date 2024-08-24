package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();
        Scanner s = new Scanner(System.in);
        boolean exit = false;

        
        while (!exit) {
            System.out.println("Employee Management App");

            System.out.println();
            System.out.println();

            System.out.println("1.Add Employee");
            System.out.println("2.Remove Employee");
            System.out.println("3.View All Employee");
            System.out.println("4.Find Employee By ID");
            System.out.println("5.Exit");

            System.out.println("Select an Option:");
            int n = s.nextInt();


            switch (n) {
                case 1:
                    em.addEmployee();
                    break;
                case 2:
                    em.removeEmployee();
                    break;
                case 3:
                    em.viewEmployee();
                    break;
                case 4:
                    em.FindEmployeeByID();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                System.out.println("Invalid Input");
                    break;
            }
        }
    }
}