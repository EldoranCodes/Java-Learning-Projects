package com.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PersonCrud {
    private List<Person> people = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createPerson(){
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Person person = new Person(id, name, age);
        people.add(person);
        System.out.println("Person added Successfully ");
    }

    public void readPeople(){
        if (people.isEmpty()){
            System.out.println("No people found");
        }
        else{
            for (Person person : people) {
                System.out.println(person);
            }
        }
    }

    public void updatePerson(){
        System.out.println("Enter ID of person to update: ");
        int id = scanner.nextInt();
        scanner.nextInt();
        Person personToUpdate = null;

        for (Person person : people){
            if (person.getID()==id){
                personToUpdate = person;
                break;
            }
        }
        if (personToUpdate != null){
            System.out.println("Enter new Name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new age: ");
            int newAge = scanner.nextInt();
            //udpate the list
            personToUpdate.setName(newName);
            personToUpdate.setAge(newAge);

            System.out.println("Person Successfully Updated");
        }else{
            System.out.println("Person not found");
        }

    }

    public void deletePerson(){
        System.out.println("the ID of person to delete: ");
        int idToBeDeleted = scanner.nextInt();
        Person personToBeDeleted = null;

        for (Person person : people){
            if (person.getID() == idToBeDeleted){
                personToBeDeleted = person;
                break;
            }
        }

        if (personToBeDeleted != null){
            people.remove(personToBeDeleted);
            System.out.println("Person deleted Successfully");
        }else{
            System.out.println("Person not found!");

        }
    }

    
}
