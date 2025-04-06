package com.nitish.excersize.repeatableannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the @BugReport annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)  // Allows multiple @BugReport annotations
public @interface BugReport {
    String description();  // Bug description
}
