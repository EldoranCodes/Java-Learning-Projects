import java.util.Scanner;

public class QuizGameWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lives = 3;

        do {
            System.out.println("Life("+lives+")");
            System.out.print("What is the Capital of the Philippines:");
            String Answer = sc.nextLine();
            if (Answer.equals("manila") ){
               break;
            }else lives--;

        }while (lives > 0);
        if (lives > 0) System.out.println("You Won!");
        else System.out.println("You Lost!");
        
    }   
}
