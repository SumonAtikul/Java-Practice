package oop;

public class Student {

    int id;
    String name;

    Student(int id, String name)
    {
        this.id = id;
        this.name=name;
    }

    void display()
    {
        System.out.println("name: "+name+"ID: "+id);
    }
}
