import java.util.Scanner;

public class Calculator{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


        int num1, num2, result;
        String Operator;


        System.out.print("Enter 1st number:");
        num1 = scanner.nextInt();


        System.out.print("What operator?(+ - * /)");
        Operator = scanner.next();

        
        System.out.print("Enter 2nd number:");
        num2 = scanner.nextInt();

        switch (Operator) {
            case "+":
                result = num1 + num2;
                System.out.print("Equals: "+ result);
                break;
            case "-":
                result = num1 - num2;
                System.out.print("Equals: "+ result);
                break;

            case "*":
                result = num1 * num2;
                System.out.print("Equals: "+ result);
                    
                break;
            case "/":
                if (num2 != 0 ){
                    result = num1 / num2;
                    System.out.print("Equals: "+ result);
                       
                }
                else{
                    System.out.println("Error: Division by 0 is not allowed");
                }
                break; 
        
            default:
            System.out.print("The Operator you put is not valid");
                break;
        }
        scanner.close();
    }
}