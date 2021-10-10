package oop;

public class University {

    final String universityName = "LU";// r change kora jabe na
    final int fees; // blank final variable
    static final int id; //static blank final variable

    static{//static final variable initilize with the help of static block
        id = 122;
    }

    University()//constructor er sahajje blank final variable initialize kora hoy
    {
        fees = 30000;
    }

    void display()
    {
        //universityName = "JU";
        System.out.println(universityName);
        System.out.println(fees);
    }

}
