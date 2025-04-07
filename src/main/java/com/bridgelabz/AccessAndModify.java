package com.bridgelabz;


import java.lang.reflect.Field;

class Configuration{
   private static int API_KEY=10;
}


public class AccessAndModify {
    public static void main(String[] args) throws Exception {
       Class<?> cs=Class.forName("com.bridgelabz.Configuration");
        //System.out.println(cs.getDeclaredFields());
        Field[] fs=cs.getDeclaredFields();
        for(Field field: fs){
            if(field.getName().equals("API_KEY")){
                field.setAccessible(true);
                field.set(null,15);
                System.out.println(field.get(null));
            }
        }
    }
}
