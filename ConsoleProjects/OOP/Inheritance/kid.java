package OOP.Inheritance;

public class kid extends Toddler {
    int gradeLevel;
    kid(String name, String sex, int age, String favoriteToy,int gradeLevel){
        super(name,sex,age,favoriteToy);
        this.gradeLevel= gradeLevel;
    }
    
    void sayGradeLevel(){
        System.out.println("My grade Level is : "+ gradeLevel);
    }
}
