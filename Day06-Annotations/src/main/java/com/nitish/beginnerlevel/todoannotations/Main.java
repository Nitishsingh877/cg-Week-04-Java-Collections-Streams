package com.nitish.beginnerlevel.todoannotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Method method = TodoManager.class.getMethod("processTodo");

            if(method.isAnnotationPresent(Todo.class)){
                Todo todos = method.getAnnotation(Todo.class);

                for(Todos todo : todos.value()){
                    System.out.println("todo report : " + todo.description() + ",  task is " + todo.task()+ " assigned to : " + todo.assignedTo() + " and priority is : " + todo.priority());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
