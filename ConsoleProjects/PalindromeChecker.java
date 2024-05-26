import java.util.Scanner;

public class PalindromeChecker {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string:");
        String EnteredStr = scanner.next();
       
        int StrLength = EnteredStr.length();

        String ReversedStr = "";

        StrLength = StrLength -1;
        
       while (StrLength >= 0)
       {

        ReversedStr = ReversedStr + EnteredStr.charAt(StrLength);
        
            StrLength--;
       }
       System.out.println("The word you entered is "+ EnteredStr);
       System.out.println("The resverse word is "+ ReversedStr);
    

       if (EnteredStr.equalsIgnoreCase(ReversedStr) ) {
        System.out.print("The word you entered is a palindrome");
        }
         else{
            System.out.print("The word you entered is not a palindrome");
        }
        
        scanner.close();

    }    
}
