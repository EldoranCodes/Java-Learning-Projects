import java.util.Scanner;

public class PairedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Email[] = {"nard@gmail.com","poochie@gmail.com","chubby@gmail.com"};
        String Username[] = {"nard","poochie","chubby"};
        String Password[] = {"123","456","789"};

        System.out.print("Enter an Inderx 0-2:");
        int index = sc.nextInt();
       
        System.out.println("Index: " +(index));
        System.out.println("Email: " +Email[index]);
        System.out.println("Username: " +Username[index]);
        System.out.println("Password: " +Password[index]);


    }
}
