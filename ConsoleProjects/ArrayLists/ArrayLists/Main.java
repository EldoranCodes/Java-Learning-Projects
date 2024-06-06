package ArrayLists.ArrayLists;

import java.util.ArrayList;

public class Main {

    
     public static void main(String[] args) {

    /* Primitive Data Types = no methods
     *  int
     *  float
     *  char
     *  double
     *  boolean
     *  byte
     */
     
    /* Non Primitive Data Types = with methods
     * String
     * Other classes 
     */

     /* (WRAPPER CLASS)
     * Integer
     * Float
     * Character
     * Double
     * Byte
      */
      
        //non primitive datatype declaration
        ArrayList<String> name = new ArrayList<String>();
        
        //WRAPPER CLASS declaration
        ArrayList<Integer> num = new ArrayList<Integer>();

        ArrayList<Student> stud = new ArrayList<Student>();

        //Writing values in ArrayList
        name.add("Nard");
        name.add("Poochie");
        name.add("Zifie");
        name.add("Sofie");

        // getting the value of the array lists
        System.out.println(name.get(0));

        //updating the value of the array lists
        System.out.println("Update index 0 into Chubby");
        name.set(0, "Chubby");
        System.out.println(name.get(0));


        num.add(8);
        num.add(42);
        num.add(323);
        num.add(10);

        System.out.println(num.get(2));

        
        stud.add(new Student("Nard", "BSCS"));
        stud.add(new Student("Zifi", "BSIT"));

        System.out.println("printing idnex 0 at Student Class: "+stud.get(0));


        stud.set(0, new Student("Naih","Education"));
        System.out.println("printing idnex 0 at Student Class: "+stud.get(0));

        //we can remove value at th array lists
        //note if index was remvoe, reset value will move
        System.out.println("Printing the name[0] : "+ name.get(0));

        System.out.println("Deleting the name[0]");
        name.remove(0);

        System.out.println("Printing the name[0] : "+ name.get(0));

        //getting the size of  the arraylist
        System.out.println("name[] size: "+name.size());


        //iterating through the arraylist

        for(int i = 0; i<name.size();i++){
            System.out.println(name.get(i));
        }
        for (Student st : stud) {   
            System.out.println(st);
            st.introduce();
        }

   
        

     }
  
}   
