import java.util.Scanner;
public class AuthenticationSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Username[] = {"nard","naih","zyville"};
        String Password[] = {"123","456","789"};

        boolean login = false;

       do{
        System.err.print("Username:");
        String user = sc.nextLine();
        System.err.print("Password:");
        String pass = sc.nextLine();
        int arrlength = Username.length;
        for(int i = 0;i<arrlength;i++){
         
            if (user.equals(Username[i])  && pass.equals(Password[i]) ){
            System.err.println("Log in Successful!, Welcome "+ Username[i]);
            login = true;
            break;
            }else login = false; 
        }
        if (login == false) System.err.println("Username and Password is Incorrect");

        
       }while (login == false);
        

 

    }
}
