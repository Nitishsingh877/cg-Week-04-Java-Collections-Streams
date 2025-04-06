package com.nitish.intermediatelevel;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of TaskManager
            TaskManager taskManager = new TaskManager();

            // Get the Class object for TaskManager
            Class<?> taskManagerClass = taskManager.getClass();

            // Get all declared methods in the class
            Method[] methods = taskManagerClass.getDeclaredMethods();

            // Iterate over the methods
            for (Method method : methods) {
                // Check if the @LogExecutionTime annotation is present on the method
                if (method.isAnnotationPresent(LogExecutionTime.class)) {
                    // Measure execution time
                    long startTime = System.nanoTime();
                    method.invoke(taskManager); // Invoke the method
                    long endTime = System.nanoTime();

                    // Calculate and print the execution time
                    long duration = endTime - startTime;
                    System.out.println("Method '" + method.getName() + "' took " + duration + " ns to execute.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
