package OOP.ArrayOfObjects.StudentRegistrationSimulation;

import OOP.StudentObjectSimulation.Student;

public class Students {
    String firstName, lastName;
    int year;
    String course;
    char section; 

    Students(String firstName, String lastName, int year, String course, char section){
        this.firstName= firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
    }

    void introduceSelf(){
        System.out.println("I am "+firstName + " "+lastName  );
        System.out.println(year + " "+ course + ", "+"section "+ section );
    } 
}
