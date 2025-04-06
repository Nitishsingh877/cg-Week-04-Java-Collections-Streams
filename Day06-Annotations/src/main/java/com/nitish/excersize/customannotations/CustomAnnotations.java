package com.nitish.excersize.customannotations;


import java.lang.reflect.Method;

public class CustomAnnotations {
    public static void main(String[] args) {
        try {
            Class<?> taskManagerClass = TaskManager.class;

            Method[] methods = taskManagerClass.getDeclaredMethods();

            for (Method method : methods){
                if(method.isAnnotationPresent(TaskInfo.class)){
                    TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                    System.out.println("methods" + method.getName());
                    System.out.println("priority is " + taskInfo.priority());
                    System.out.println("assingned to "  + taskInfo.assignedTo());
                    System.out.println();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
