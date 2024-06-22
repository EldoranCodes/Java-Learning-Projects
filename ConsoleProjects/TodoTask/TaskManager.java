package TodoTask;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    Scanner sc= new Scanner(System.in);

    private ArrayList<Task> tasks = new ArrayList<Task>();

    public void addtask(){
        System.out.print("Enter a Task: ");
        String taskStr = sc.nextLine();
        tasks.add(new Task(taskStr, false));
        System.out.println("Task successfully added!");
        System.out.println();
    }
    public void deleteTask(int index){  
        if (index > 0 && index <= tasks.size()) {
            tasks.remove(index - 1);
            System.out.println("Task " + index + " deleted.");
        } else {
            System.out.println("Invalid task number.");
        }
       
    }
    public void showTasks(){
        if(tasks.isEmpty()) {
            System.out.println("No Tasks Available");
        }else{
            System.out.println("TASK LISTS");
            for (int i= 0;i<tasks.size(); i++ ) {
                System.out.print("#"+(i+1)+". ");
                tasks.get(i).showTask();
            }
        }
    }
    public void completeTask(int index){
        if (index > 0 && index <= tasks.size()) {
            tasks.get(index - 1).completeTask();
            System.out.println("Task " + index + " marked as completed.");
        
        } else {
            System.out.println("Invalid task number.");
        }
    
    }
    

    
}


