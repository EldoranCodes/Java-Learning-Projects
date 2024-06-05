package OOP.Inheritance;

public class Toddler extends Person {
    String FavoriteToy;

    Toddler(String name,String sex, int age, String FavoriteToy){
        super(name,sex,age);
        this.FavoriteToy= FavoriteToy;
    }
    void drink(){
        System.out.println("Drinking Milk!");
    }

    void checkStatus(){
        super.checkStatus();
        System.out.println("Favorite Toy: "+ FavoriteToy);
    }
}
