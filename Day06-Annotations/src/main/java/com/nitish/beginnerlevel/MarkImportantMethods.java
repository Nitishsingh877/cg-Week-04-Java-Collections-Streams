package com.nitish.beginnerlevel;



import java.lang.reflect.Method;

public class MarkImportantMethods {
    public static void main(String[] args) {
       try {
           Method method = TaskManager.class.getMethod("processTask");

           if(method.isAnnotationPresent(ImportantMethod.class)){
               ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);

               for (ImportantMethods importantmethod : importantMethod.value()){
                   System.out.println("methods processing : " + importantmethod.description());
               }
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }

}
