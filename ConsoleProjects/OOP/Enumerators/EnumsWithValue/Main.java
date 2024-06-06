package OOP.Enumerators.EnumsWithValue;

public class Main {
    public static void main(String[] args) {
        //enums with value
        USCurrency monney = USCurrency.QUARTER;
        System.out.println(monney.value);


        // enums with value in array

        USCurrency coins[] = new USCurrency[4];
        coins[0] = USCurrency.PENNY;
        coins[1] = USCurrency.NICKLE;
        coins[2] = USCurrency.DIME;
        coins[3] = USCurrency.QUARTER;

        System.out.println("PENNY: "+ coins[0].value);
        System.out.println("NICKLE: "+ coins[1].value);
        System.out.println("DIME: "+ coins[2].value);
        System.out.println("QUARTER: "+ coins[3].value);
        float sum =0;
        for (USCurrency coin : coins) {
            sum = sum + coin.value;
        }
        System.out.println("Sum: "+ sum);


        // print the  names
        System.out.println("Name of coins[0]:"+coins[0].name);
    } 
}
