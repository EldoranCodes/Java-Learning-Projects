package TodoTask;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        //declare the taskmanager before we can use it
        TaskManager taskManager = new TaskManager();

        System.out.println("TO DO TASK");
        boolean RunProgram = true;
        while (RunProgram) {
            taskManager.showTasks();
            System.out.println();

            System.out.println("Select Option");
            System.out.println("1. Add task");
            System.out.println("2. Complete Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter a number: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    taskManager.addtask();
                    break;
                case 2:
                    System.out.print("Enter the task number to mark as complete: ");
                    int completeTaskNumber = sc.nextInt();
                    sc.nextLine();
                    taskManager.completeTask(completeTaskNumber);
                    break;
                case 3:
                    System.out.print("Enter the task number to delete: ");
                    int deleteTaskNumber = sc.nextInt();
                    sc.nextLine();
                    taskManager.deleteTask(deleteTaskNumber);
                    break;
                case 4:
                    RunProgram = false;
                    break;
                        
                default:
                System.out.println("Invalid input");
                    break;
            }

          

            
        
            
           
        }   
        sc.close();     
    }    
}
