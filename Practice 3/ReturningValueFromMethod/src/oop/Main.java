package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ReturningValue value = new ReturningValue();

        int res = value.square(6);

        System.out.println(res);

        System.out.println(value.square(5));
    }
}
