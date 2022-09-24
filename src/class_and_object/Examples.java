package class_and_object;

import java.util.ArrayList;

public class Examples {

//    1. Object is an instance of the Class.
//    2. Class is a blueprint of the object.

    // Examples of syntax:

    // class Statue{}
    // object => Statue lincoln = new Statue();
    //           Statue liberty = new Statue();


    // class StatueOfLiberty{} => should be a woman, has crown, represents freedom
    // object => StatueOfLiberty inNY = new StatueOfLiberty();

    // Object class is the Parent of all classes => that's why all the classes are meant to create the objects.

    String object = new String();
    // String - name of the class
    // object - name of the object
    // = new - the object builder
    // () - the constructor is called

    ArrayList<Object> objects = new ArrayList<>();


    public static void main(String[] args) {

       Fish blueTang = new Fish();
       Fish yellowTang = new Fish(true, 3,"Small", false, "yellow");
       Fish ahi = new Fish();
       Fish aku = new Fish();

       blueTang.canSwim = true;
       blueTang.color = "Blue";
       blueTang.fins = 4;
       blueTang.size = "Small";
       blueTang.eatsOtherAnimals = false;

        System.out.println(blueTang);
        System.out.println(yellowTang);














    }




}
