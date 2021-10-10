package oop;

public class Student {

    String name, gender;
    int id;
    Student()
    {
        System.out.println("no info");
    }

    Student(String n, String g)
    {
        name = n;
        gender=g;

    }

    Student(String n, String g, int i)
    {
        name = n;
        gender=g;
        id=i;
    }

    void display()
    {
        System.out.println("name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("ID: "+id);
    }


}
