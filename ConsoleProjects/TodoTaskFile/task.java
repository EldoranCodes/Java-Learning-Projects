import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task {
   
    public static void main(String[] args) {
        showMenu();
      
    }

    private static void programflow(){
        createTaskFile();
    }

    private static void showMenu(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("1. add task");
        System.out.println("2. view task");
        System.out.println("3. delete task");
        System.out.println("4. edit task");
        System.out.println("5. exit program");

        int response = sc.nextInt();


        switch (response) {
            case 1:
                addTask();
                break;
            case 2:
                viewTask();
                break;
            case 3:
                deleteTask();
                break; 
            case 4:
                editTask();
                break;
                

            default:
                System.out.println("Program Closed5");
                break;
        }

    }
    private static void addTask(){
        // String storedTask = getTask();
        System.out.println("Name of your task: ");
        Scanner sc = new Scanner(System.in);
        String task = sc.nextLine();
        insertTask(task);
        showMenu();
    }
    private static void viewTask(){
        String tasks;
        int num = 0;
        System.out.println("Task Lists: ");
        try {
            File mytasksObj = new File("TodoTaskFile/mytasks.txt");
            Scanner myRead = new Scanner(mytasksObj);
            while (myRead.hasNextLine()) {
              
                num++;
                tasks = myRead.nextLine();
                System.out.println(num + ". "+tasks);
          
            }
            myRead.close();
        } catch (Exception e) {
            // TODO: handle
            e.printStackTrace();
        }
      
        showMenu();
    }
    
    private static void deleteTask(){
        viewTask();
        System.out.println();
        System.out.println("Select number you want to delete: ");
        Scanner sc = new Scanner(System.in);
        
        int linenum = sc.nextInt();
        sc.nextLine();

        
        

        //get the tasks insert them into arrays
        //delete that element in the array
        //right the array of strings at the file

        showMenu();
    }
    private static void editTask(){
        System.out.println("edited the task!");
        showMenu();
    }

    private static void insertTask(String task){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("TodoTaskFile/mytasks.txt",true))) {
            writer.write(task);
            writer.newLine();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 

    //create task.txt
    private static void createTaskFile(){
        File myTasks = new File("TodoTaskFile/mytasks.txt");
        
        try {
            if(myTasks.createNewFile()){
                System.out.println("File created: "+ myTasks.getName());
            }else {
                System.out.println("File already exist!");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
