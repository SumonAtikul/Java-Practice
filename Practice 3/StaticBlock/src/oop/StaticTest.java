package oop;

public class StaticTest {
    static int id;
    static String name;

    static{ //static block
        id = 122;
        name = "Sumon";
    }

    static void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}
