package Fundamentals;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNum = random.nextInt(100) + 1;
        boolean run = true;
        System.out.println("Guess the number Game");
        System.out.println("Enter the number to guess (1 - 100)");
        int enteredNumber;

        while (run) {
            System.out.print("Enter a number: ");
            enteredNumber = sc.nextInt();
            sc.nextLine();

            if (enteredNumber == randomNum) {
                System.out.println("You got it right!");
                run = false;
            } else if (enteredNumber < randomNum) {
                System.out.println("Hint: the random number is higher than the number you entered.");
            } else {
                System.out.println("Hint: the random number is lower than the number you entered.");
            }
        }
    }
}
