package com.bridgelabz;


import java.lang.reflect.Constructor;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", age: " +age);
    }
}

public class DynamicObjectCreation  {
    public static void main(String[] args) throws Exception {
       Class<?> cs=Class.forName("com.bridgelabz.Student");
        Constructor<?> ct=cs.getConstructor(String.class,int.class);
        Object student1=ct.newInstance("ram",18);
        //cs.getMethod("displayInfo").invoke(student1);
Student student=(Student) student1;
student.displayInfo();



    }
}
