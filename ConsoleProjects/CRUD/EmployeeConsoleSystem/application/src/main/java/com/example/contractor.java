package com.example;

import java.time.LocalDate;

public class contractor extends Employee {
    private double fixedRate;
    private boolean isProjectFinished;
    private String projectname;
    private LocalDate datestarted;
    private LocalDate expectedDateFinished;
    private LocalDate dateFinished;


    public void setFixedRate(double rate){
        fixedRate = rate;
    }
    public double getFixedRate(){
        return fixedRate;
    }
    public void setProjectToFinished(boolean  isFinished){
        isProjectFinished = isFinished;
    }
    public boolean isProjectFinished(){
        return isProjectFinished;
    }
    public void setProjectName(String projName){
        projectname = projName;
    }
    public String getProjectName(){
        return projectname;
    }

    public void setProjectDateStarted(LocalDate start){
        datestarted = start;
    }
    public LocalDate getProjectDateStarted(){
        return datestarted;
    }
    public void setProjectFinishedDate(LocalDate finishDate){
        dateFinished = finishDate;
    }
    public LocalDate getProjectFinishedDate(){
        return dateFinished;
    }

   

    @Override
    public double calculateSalary() {
        // TODO Auto-generated method stub
        return fixedRate;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "|ID = "+ getID() + "|Name = "+ getName() + "|Department = "+  getDepartment() +
        "|Fixed Rate = "+ fixedRate + "|Project Name = "+ projectname +
        "|Is it Finished? = "+ isProjectFinished +"|Projcet Date Started = "+ datestarted.toString() +
        "|Expected Date to be finished = "+expectedDateFinished +"|Project Date Finished = "+ dateFinished.toString() ;

    }

}
