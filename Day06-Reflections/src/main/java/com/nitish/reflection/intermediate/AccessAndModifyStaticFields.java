package com.nitish.reflection.intermediate;

import java.lang.reflect.Field;
import java.util.Map;
class Configuration {
private static String API_KEY = "2024-10-26T10:00:00Z";
}

public class AccessAndModifyStaticFields {
    public static void main(String[] args) throws Exception{
        Configuration configuration = new Configuration();

        Class<?> cls = configuration.getClass();

        //access private field
        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);

        //get field val
        System.out.println("original api is  " + field.get(configuration));

        //modify field
        field.set(configuration, "2024-10-26H10:11:00P");

        System.out.println("after modifying is  " + field.get(configuration));
    }

}
