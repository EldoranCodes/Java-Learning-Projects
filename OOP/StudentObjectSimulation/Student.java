package OOP.StudentObjectSimulation;

public class Student {
    String firstName, lastName,course,section;
    int year;
    float midtermGrade,finalGrade;
     Student(String firstName, String lastName, String course, String section,int year, int midtermGrade,int finalGrade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.section = section;
        this.year = year;
        this.midtermGrade=midtermGrade;
        this.finalGrade = finalGrade;
    }

     void introduceSelf(){
        System.out.println("Hello, I am "+ lastName +", "+ firstName);
        String yearLvl="";
        switch (year) {
            case 1:
                yearLvl = "1st year";
                break;
            case 2:
                yearLvl = "2nd year";
                break;
            case 3:
                yearLvl = "3rd year";
                break;
            case 4:
                yearLvl = "4th year";
                break;
            case 5:
                yearLvl = "5th year";
                break;
            default:
                break;
        }
        System.out.println("I am "+ yearLvl +" "+course +" student, section "+ section );

    }
    
     void EvaluateGrade(){
        float average = (midtermGrade + finalGrade) / 2;   
        System.out.println("Average Grade: "+average);
        System.out.print("Remark: ");
        if (average > 100 ) System.out.println("Invalid Grade");
        else if (average >= 98 && average <= 100)System.out.println("With Highest Honors");
        else if (average >= 95 && average <= 97.99)System.out.println("With High Honors");
        else if (average >= 90 && average <= 94.99)System.out.println("With Honors");
        else if (average >= 75 && average <= 89.99)System.out.println("Passed");
        else if (average < 75 )System.out.println("Failed");

    }
}
