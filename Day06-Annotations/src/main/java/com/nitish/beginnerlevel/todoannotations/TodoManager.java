package com.nitish.beginnerlevel.todoannotations;

public class TodoManager {
    @Todos(description = "pending",task = "home work",assignedTo = "Nitish",priority = "High")
    @Todos(description = "Approved",task = "class work",assignedTo = "siddhu",priority = "low")
    public void processTodo() {
        System.out.println("processing task...");
    }
}
