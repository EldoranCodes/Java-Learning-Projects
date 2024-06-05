package OOP.OverLoadingConstructor.Employee;

public class Employee {
    private String FirstName, LastName;
    private String JobTitle, Address, Sex;
    private int Age;
    //constructor1
    Employee(String FirstName,
        String LastName,
        String JobTitle,
        String Address,
        String Sex,
        int Age){
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.JobTitle = JobTitle;
            this.Address = Address;
            this.Sex = Sex;
            this.Age = Age;
    }
       //constructor2
    Employee(String FirstName,
        String LastName,
        String JobTitle){
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.JobTitle = JobTitle;
            Address= "N/A";
            Sex ="N/A";
            Age = 0;
        }

    Employee(){
      
        FirstName= "N/A";
        LastName= "N/A";
        JobTitle= "N/A";
        Address= "N/A";
        Sex ="N/A";
        Age = 0;
            
        }
    void EmployeeDetails(){
        System.out.println("First Name: "+ FirstName);
        System.out.println("Last Name: "+ LastName);
        System.out.println("Address: "+ Address);
        System.out.println("Job Title: "+ JobTitle);
        System.out.println("Address: "+ FirstName);
        System.out.println("Sex: "+ Sex);
        System.out.println("Age: "+ Age);
    }    
}
