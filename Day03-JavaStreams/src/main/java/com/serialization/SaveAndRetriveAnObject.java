package com.serialization;

import java.io.*;
import java.util.Arrays;
import java.util.List;

class Employee implements Serializable {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//       return "{ " + id + " belongs to " + name + " belongs to department " + department + " earns $ " + salary  ;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class SaveAndRetriveAnObject {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day03-JavaStreams\\src\\main\\resources\\ObjectISW.txt";
       List<Employee> employee = Arrays.asList( new Employee(101,"Nitish","cse-aiml",1000),
        new Employee(102,"siddhu","cpp",500),
        new Employee(103,"raj","ai",800));

        //serialization

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))){
            oos.writeObject(employee);
            System.out.println("object serialised successfully");

        }catch (IOException e){
            e.printStackTrace();
        }


        //deserialization
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            List<Employee> deserializedEmployee = (List<Employee>)  ois.readObject();

            for (Employee e : deserializedEmployee) {
                System.out.println("Deserialized object: " + deserializedEmployee);
            }
        }catch (IOException e){
            e.getStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
