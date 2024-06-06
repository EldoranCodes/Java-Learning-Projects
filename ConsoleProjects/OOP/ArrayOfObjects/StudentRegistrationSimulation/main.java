package OOP.ArrayOfObjects.StudentRegistrationSimulation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many students will register?: ");
        int studentNum = s.nextInt();
        s.nextLine();

        Students students[] = new Students[studentNum];
        
        System.out.println();

        for(int i = 0; i< studentNum; i++){
            System.out.println("Student no. "+ (i +1));
           
            System.out.print("First Name: ");
            String fname=s.nextLine(); 

            System.out.print("Last Name: ");
            String lname=s.nextLine(); 

            System.out.print("Year: ");
            int year=s.nextInt();
            s.nextLine();

            System.out.print("Course: ");
            String course = s.nextLine();

            System.out.print("Section: ");
            char section = s.nextLine().charAt(0);

            students[i] = new Students(fname,lname,year,course,section);
            System.out.println();


           
         
        }
        System.out.println("Registration of "+studentNum+ "student(s) is Successful!");
        System.out.println();
        System.out.println("Introducing the registered students");
        System.out.println();

        for(int i = 0; i< studentNum; i++){
            System.out.println("Student No. "+ (i+1));

            students[i].introduceSelf();
            System.out.println();
        }

    }
  
}
