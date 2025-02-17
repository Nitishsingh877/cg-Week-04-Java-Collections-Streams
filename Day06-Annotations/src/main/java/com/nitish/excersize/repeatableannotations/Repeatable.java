package com.nitish.excersize.repeatableannotations;

import java.lang.reflect.Method;

public class Repeatable {
    public static void main(String[] args) {
        try {
            Method method = TaskManger.class.getMethod("processTask");

            //check if method
            if(method.isAnnotationPresent(BugReports.class)){
                BugReports bugReports = method.getAnnotation(BugReports.class);

                for (BugReport bugReports1 : bugReports.value()){
                    System.out.println("Bug Report :" + bugReports1.description());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
