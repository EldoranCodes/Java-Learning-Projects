package OOP.Polymorphism.Enemy;

public class Main {
    public static void main(String[] args) {
        Enemy we = new WeakEnemy();
        Enemy se = new StrongEnemy();


        we.dialog();
        se.dialog();

        we.showStats();
        se.showStats();
        
    }
}
