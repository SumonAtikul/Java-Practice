package oop;

public class Student {
    String name;
    int id;
    static String universityName = "LU";

    Student(String name, int id)
    {
        this.name = name;
        this.id=id;
    }


    void display()
    {
        System.out.println("name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University Name: "+universityName);
    }

}
