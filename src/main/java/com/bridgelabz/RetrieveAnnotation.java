package com.bridgelabz;




@Author
class SolarSystem{
    String planetName;
}
public class RetrieveAnnotation {
    public static void main(String[] args) throws Exception {
    Class cs=Class.forName("com.bridgelabz.SolarSystem");
        Author an = (Author) cs.getAnnotation(Author.class);
        System.out.println(an.name());


    }
}

//Retrieve Annotations at Runtime:
//Create a custom annotation @Author(name="Author Name").
//Apply it to a class and use Reflection to retrieve and
//        display the annotation value at runtime.
