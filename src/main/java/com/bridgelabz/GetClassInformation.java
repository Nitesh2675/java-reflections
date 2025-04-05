package com.bridgelabz;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Animal{
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
void sound(){
    System.out.println("Animal sound..");
}

}
public class GetClassInformation {
    public static void main(String[] args) {
        Animal obj1=new Animal("Tom",2);
        System.out.println(obj1.getClass());
        Method[] method=obj1.getClass().getDeclaredMethods();
        for(Method m:method){
            System.out.println(m);
        }
        Field[] field=obj1.getClass().getDeclaredFields();
        for(Field m:field){
            System.out.println(m);
        }
       Constructor[] c=obj1.getClass().getConstructors();
        for(Constructor m:c){
            System.out.println(m);
        }
    }
}


/*
import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInspector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fully qualified class name (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();

        try {
            // Load the class dynamically
            Class<?> cls = Class.forName(className);

            System.out.println("\nClass: " + cls.getName());

            // Display Constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("  " + constructor);
            }

            // Display Fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("  " + field);
            }

            // Display Methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("  " + method);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }

        scanner.close();
    }
}

 */