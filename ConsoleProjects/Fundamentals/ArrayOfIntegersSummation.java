package Fundamentals;
import java.util.Scanner;

public class ArrayOfIntegersSummation {
    public static void main(String[] args) {
        int[] num = {123,456,789,1011,1213,1415,1817};
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }
        System.out.println("Total is:" + sum);
    }
}
