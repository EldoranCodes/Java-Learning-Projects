package OOP.OverLoadingConstructor.Employee;

public class main {
  public static void main(String[] args) {

    //using the constructor1 with setting all the attributes
    Employee e1 = new Employee("nard", "Dela Cruz", "Programmer", "San Vicente Sur", "Male", 25);
    //using the 2nd constructor with less arguments
    Employee e2 = new Employee("Poochie", "Dalisay", "Guard");
    //using 3rd constructor with no arguments
     Employee e3 = new Employee();
     
    e1.EmployeeDetails();
    System.out.println();
    e2.EmployeeDetails();
    System.out.println();
    e3.EmployeeDetails();
  
  }
}
