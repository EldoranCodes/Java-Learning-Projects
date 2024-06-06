package OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        
       

        Animal d= new Dog();
        Animal c = new Cat();

        d.makesound();
        c.makesound();

        d.setName("Poochie");
        c.setName("Zifie");


        d.showname();
        c.showname();

    }
}
