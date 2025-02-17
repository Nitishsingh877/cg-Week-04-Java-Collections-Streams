package com.nitish.beginnerlevel.todoannotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(Todo.class)
public @interface Todos {
    String description();
    String task();
    String assignedTo();
    String priority() default "Medium";
}
