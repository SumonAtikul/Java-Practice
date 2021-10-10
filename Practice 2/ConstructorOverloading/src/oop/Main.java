package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student();

        Student student1 = new Student("sumon", "male");
        student1.display();

        Student student2 = new Student("abir", "male", 18);
        student2.display();
    }
}
