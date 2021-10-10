package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher teacher = new Teacher();

        teacher.name = "sumon";
        teacher.age = 22;
        teacher.qualification = "hons";
        teacher.display2();

        Teacher teacher2 = new Teacher();

        teacher2.name = "sumon";
        teacher2.age = 22;
        teacher2.qualification = "hons";
        teacher2.display2();
        teacher2.display2();
    }
}
