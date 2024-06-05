package Fundamentals;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            arrayList.add(element);
        }
        System.out.println("Original array: "+ arrayList);
        
        for (int i = 0; i < n / 2; i++){
            int temp = arrayList.get(i);
            arrayList.set(i,arrayList.get(n-1-i));
            arrayList.set(n-1-i, temp);
        }
        System.out.println("Reversed array: "+ arrayList);
        scanner.close();
    }
}