package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       PersonCrud personCRUD = new PersonCrud();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Add Person");
            System.out.println("2. View People");
            System.out.println("3. Update Person");
            System.out.println("4. Delete Person");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    personCRUD.createPerson();
                    break;
                case 2:
                    personCRUD.readPeople();
                    break;
                case 3:
                    personCRUD.updatePerson();
                    break;
                case 4:
                    personCRUD.deletePerson();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
    }   }
}

 
  
