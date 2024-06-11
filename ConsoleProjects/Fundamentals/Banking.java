package Fundamentals;

import java.util.Scanner;

public class Banking {

    private String name;
    private double balance;
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banking banking = new Banking();
        banking.setInfo();
        
        boolean run = true;

        while (run){
            banking.displayInfo();
            System.out.println();
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.print("Please Enter a number: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    banking.withdraw();
                    break;
                case 2:
                    banking.deposit();
                    break;
            
                default:
                    break;
            }
        }


    }

    public void setInfo() {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
    public void withdraw(){
        System.err.println("Balance: "+ balance);
        System.out.print("Enter Amount of withdrawal: ");
        double amount = sc.nextDouble();
        if (amount > balance)System.out.println("Balance is not enough!");
        else{
            balance = balance - amount;
            System.out.println("Successfull withdraw");
        }
    }
    public void deposit(){
        System.err.println("Balance: "+ balance);
        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        balance = balance + amount;

        System.out.println("Deposit Successful!");
    }
}
