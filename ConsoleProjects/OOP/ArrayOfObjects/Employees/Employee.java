package OOP.ArrayOfObjects.Employees;

public class Employee {
    String firstName, lastName;
    String jobTitle;


    Employee(String firstName, String lastName, String jobTitle){
        this.firstName=firstName;
        this.lastName =lastName;
        this.jobTitle = jobTitle;
    }

    void introduceSelf(){
        System.out.println("Full Name: "+ firstName + " "+ lastName);
        System.out.println("Job Title: "+ jobTitle);
    }
}
