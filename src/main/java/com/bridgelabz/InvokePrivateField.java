package com.bridgelabz;


import java.lang.reflect.Method;

class Calculator{
    private static int multiply(int a,int b){
        return a*b;
    }
}
public class InvokePrivateField {
    public static void main(String[] args) throws Exception {
            Class<?> cls = Class.forName("com.bridgelabz.Calculator");
            System.out.println(cls);
            Method[] m=cls.getDeclaredMethods();
            for(Method methods:m){
                if(methods.getName().equals("multiply")){
                    methods.setAccessible(true);
                    System.out.println(methods.invoke(null,10,15));
                }
            }


    }
}
