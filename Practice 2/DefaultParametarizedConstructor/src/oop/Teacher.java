package oop;

public class Teacher {

    String name, gender;
    int id;

    Teacher(String n, String g, int i)
    {
        name = n;
        gender = g;
        id = i;
    }

    Teacher()
    {
        System.out.println("no valued");
    }

    void teacherInfo()
    {
        System.out.println("name: "+name);
        System.out.println("Id: "+id);
        System.out.println("genderr: "+gender);

    }
}
