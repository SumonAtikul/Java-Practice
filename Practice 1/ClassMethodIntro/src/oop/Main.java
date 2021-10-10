package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher teacher = new Teacher();
        teacher.name="sumon";
        teacher.gender="male";
        teacher.phn=00;
        teacher.displayInfo();

//        System.out.println("name: "+teacher.name);
//        System.out.println("gender: "+teacher.gender);
//        System.out.println("phn: "+teacher.phn);
        Teacher teacher1 = new Teacher();
        teacher1.name="s";
        teacher1.gender="m";
        teacher1.phn=00;
        teacher1.displayInfo();
    }
}
