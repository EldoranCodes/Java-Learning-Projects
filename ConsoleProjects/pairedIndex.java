import java.util.Scanner;

public class pairedIndex {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int index;
    String Email[] ={"nardodo8@gmail.com", "kingkong@gmail.com", "Borologs@gmail.ocm"} ;
    String Username[] ={"nardo", "DonkeyKong","borlogin"};
    String Password[] = {"dranoel", "banana", "borlogpassword"};

    System.out.print("Enter an index (1-3):");
    index = sc.nextInt();
    index = index - 1;
     
    System.out.println("Index: " + (index+1));
    System.out.println("Email: " + Email[index]);
    System.out.println("Username: " + Username[index]);
    System.out.println("Password: " + Password[index]);
    sc.close();
  }
}
