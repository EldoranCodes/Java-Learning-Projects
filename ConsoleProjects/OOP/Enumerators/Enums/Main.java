package OOP.Enumerators.Enums;

public class Main {
    public static void main(String[] args) {
        AILevel level = AILevel.HARD;
        // for loops enums
        if (level ==AILevel.EASY) System.out.println("For Babies");
        else if(level == AILevel.MEDIUM) System.out.println("For Kids");
        else if(level == AILevel.HARD) System.out.println("For Men");

        // swtich case ENUM
        switch (level) {
            case EASY:
            System.out.println("For Babies");
                break;
            case MEDIUM:
            System.out.println("For Kids");
                break;
            case HARD:
            System.out.println("For Men");
                break;
            default:
                break;
        }
    }
}
