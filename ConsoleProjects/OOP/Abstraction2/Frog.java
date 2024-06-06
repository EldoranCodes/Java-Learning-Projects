package OOP.Abstraction2;

public class Frog implements Animal,WaterAnimal, LandAnimal {

    public void walk(){
        System.out.println("walking");
    }
    public void swim(){
        System.out.println("swiming");
    }

    public void makesound() {
        System.out.println("Ribbit! Ribbit!");
    }
}
