package com.bridgelabz;


import java.lang.reflect.Field;

class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public Person(int age) {
        this.age = age;
    }

}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
       Person obj1=new Person(12);
        Field[] f=obj1.getClass().getDeclaredFields();
        for(Field field:f){
            if(field.getName().equals("age")){
                field.setAccessible(true);
                field.set(obj1,15);
            }
        }
        System.out.println(obj1.getAge());
    }
}
