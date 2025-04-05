package com.bridgelabz;


import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations{

    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
}
public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("choose (add,subtract,multiply)");
        String methodName=sc.nextLine();
        System.out.println("enter values...");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Class<?> cs=Class.forName("com.bridgelabz.MathOperations");
        System.out.println(cs.getName());
        Object Mathob=cs.getDeclaredConstructor().newInstance();
        Method m=cs.getMethod(methodName,int.class,int.class);
        System.out.println(m.invoke(Mathob,a,b));


    }
}
