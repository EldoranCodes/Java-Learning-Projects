package Fundamentals;
import java.util.Scanner;
public class gradeAverage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a grade:");
        float grade1 = sc.nextInt();
        System.out.print("Enter a grade:");
        float grade2 =sc.nextInt();
        System.out.print("Enter a grade:");
        float grade3 = sc.nextInt();
        System.out.print("Enter a grade:");
        float grade4 = sc.nextInt();

        float average = (grade1 + grade2 + grade3+ grade4)/4;
        System.out.println("Average: "+average);
        if (average > 100 ) System.out.println("Invalid Grade");
        else if (average >= 98 && average <= 100)System.out.println("With Highest Honors");
        else if (average >= 95 && average <= 97.99)System.out.println("With High Honors");
        else if (average >= 90 && average <= 94.99)System.out.println("With Honors");
        else if (average >= 75 && average <= 89.99)System.out.println("Passed");
        else if (average < 75 )System.out.println("Failed");

        
        
    }
}