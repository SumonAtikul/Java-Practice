package oop;

public class Teacher {
    String name, gender;
    int phone;

    Teacher(String n, String g, int p)
    {
        name = n;
        gender = g;
        phone = p;
    }

    void teacherInfo()
    {
        System.out.println("name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("phone: "+phone);
    }

}
