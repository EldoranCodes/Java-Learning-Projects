package OOP.Abstraction;

public abstract class Animal {
    String name;

    abstract void makesound();
    void showname(){
        System.out.println("Animal name is "+ name);
    }
    void setName(String name){
        this.name = name;
    }
}
