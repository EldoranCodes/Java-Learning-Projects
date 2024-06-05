package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Poochie","Male",7);
        Toddler toddler1 = new Toddler("Pluto","Female",1,"Ball");
        person1.checkStatus();
        toddler1.checkStatus();

        //toddler is modified version of Person class       
        toddler1.drink();                                      
        //person1 cannot do drink();

        // can inherit the class that has been inherit a class
        kid k1 = new kid("Zifi", "Female", 2, "Wires", 1);
        k1.sayGradeLevel();
        k1.checkStatus();    
    }
}
