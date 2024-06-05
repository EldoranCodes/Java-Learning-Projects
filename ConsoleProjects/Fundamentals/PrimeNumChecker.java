package Fundamentals;
import java.util.Scanner;

public class PrimeNumChecker {
    public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Prime Number:");
        int n = scanner.nextInt();

       if (n == 1){
        System.out.print("Number is not a Prime");
       }
       else if (n ==2){
        System.out.print("Number is  a Prime");

       }
       else if (n > 3){
        System.out.print("Number is  a Prime");

       }
       else {  
      
        System.out.print("number you input is not valid");

       }
       scanner.close();

    }

}
