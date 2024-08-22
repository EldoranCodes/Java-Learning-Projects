package Fundamentals;

import java.util.Random;
class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(6)+1;
        double y = random.nextInt(20);
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}