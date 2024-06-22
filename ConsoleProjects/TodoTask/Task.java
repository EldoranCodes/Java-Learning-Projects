package TodoTask;

public class Task {
    String task;
    Boolean done;

    public Task(String task,Boolean done){
        this.task = task;
        this.done = done;
    }

    boolean isDone(){
        return done;
    }
    String getTaskName(){
        return task;
    }
    void showTask(){
        String isDone;
        if (done)isDone = "Completed";
        else isDone = "Incomplete";
        
       System.out.println(task+" [Status: "+ isDone+"]");
       System.out.println();
    }
    void completeTask(){
        done = true;    
    }

}
