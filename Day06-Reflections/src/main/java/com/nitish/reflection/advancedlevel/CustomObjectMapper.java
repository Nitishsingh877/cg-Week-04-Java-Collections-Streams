package com.nitish.reflection.advancedlevel;

import java.lang.reflect.Field;
import java.util.Map;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class CustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String,Object> properties){

        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            for(Map.Entry<String, Object> entry : properties.entrySet()){
                try {
                    Field field = clazz.getDeclaredField(entry.getKey());
                    field.setAccessible(true);
                    field.set(instance, entry.getValue());
                }catch (NoSuchFieldException e){
                    e.getMessage();
                }
            }return instance;
        }catch (Exception e){
            throw new RuntimeException("error mapping properties to object",e);
        }
    }

    public static void main(String[] args) {
        Map<String,Object> properties = Map.of("name","john","age",30);

        Person person = toObject(Person.class,properties);
        System.out.println("Name " + person.getName());
        System.out.println("age is " + person.getAge());
    }

}
