
public class Person {
    private String name;
    private int age;


public Person(String name, int age){
    this.name = name;
    this.age = age;
}
public void displayDetails(){
    System.out.println("Name: "+ name + " Age: " + age);
}
    public static void main (String[]args){

        Person person1 = new Person("Bob", 24);

        person1.displayDetails();
    }
  
}



