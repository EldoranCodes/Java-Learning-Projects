package Fundamentals;
import java.util.Scanner;

public class DateFormater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month:");
        int month = sc.nextInt();
        System.out.print("Enter Day:");
        int day = sc.nextInt();
        System.out.print("Enter Year:");
        int year = sc.nextInt();
        String monthStr="";
        switch (month) {
            case 1:
                monthStr = "January";
                break;
            case 2:
                monthStr = "February";
                break;
            case 3:
                monthStr = "March";
                break;
            case 4:
                monthStr = "April";
                break;
            case 5:
                monthStr = "May";
                break;
            case 6:
                monthStr = "June";
                break;
            case 7:
                monthStr = "July";
                break;
            case 8:
                monthStr = "August";
                break;
            case 9:
                monthStr = "September";
                break;
            case 10:
                monthStr = "October";
                break;
            case 11:
                monthStr = "November";
                break;
            case 12:
                monthStr = "December";
                break;
                
            default:
                break;
        }
        System.out.print(monthStr + " "+ day + ", "+ year);
        
    }
}
