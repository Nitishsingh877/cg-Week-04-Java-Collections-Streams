package com.nitish.excersize.customannotations;

public class TaskManager {
    @TaskInfo(priority = 5,assignedTo = "Nitish")
    public void task1(){
        System.out.println("task1 is excuting");
    }
    @TaskInfo(priority = 3,assignedTo = "siddhu")
    public void task2(){
        System.out.println("task2 is excuting");
    }
}
