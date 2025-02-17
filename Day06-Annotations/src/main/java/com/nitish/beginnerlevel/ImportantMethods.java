package com.nitish.beginnerlevel;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ImportantMethod.class)
public @interface ImportantMethods {
    String description() default "HIGH";
}
