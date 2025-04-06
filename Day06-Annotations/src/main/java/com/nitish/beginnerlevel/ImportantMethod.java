package com.nitish.beginnerlevel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.logging.Level;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ImportantMethod {
    ImportantMethods[] value();
}
