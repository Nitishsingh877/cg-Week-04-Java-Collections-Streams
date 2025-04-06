package com.nitish.reflection.intermediate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Auhtor {
    String name() default "Author Name";
}

class Test {
    @Auhtor(name = "Nitish singh")

    public void myAuthor(){
        System.out.println("Excueting myAuthor()");
    }
}

public class RetriveAnnotationsAtRuntime {
    public static void main(String[] args) throws Exception {
        Test obj = new Test();
        Class<?> cls = obj.getClass();

        //access methods
        Method method = cls.getMethod("myAuthor");

        //check if annotations are present
        if(method.isAnnotationPresent(Auhtor.class)){
            //retrieve details
            Auhtor auhtor = method.getAnnotation(Auhtor.class);
            System.out.println("author is " + auhtor.name());
        }

        //invoke method
        method.invoke(obj);
    }
}
