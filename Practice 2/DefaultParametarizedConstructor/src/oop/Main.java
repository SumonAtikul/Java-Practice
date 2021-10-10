package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Teacher teacher = new Teacher("Sumon", "male", 122);
       teacher.teacherInfo();

        Teacher teacher1 = new Teacher("S", "male", 123);
        teacher1.teacherInfo();

        Teacher teacher2 = new Teacher();
        teacher2.teacherInfo();
    }
}
