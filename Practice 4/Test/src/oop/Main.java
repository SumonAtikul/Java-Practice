package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Test ob1 = new Test();//non static tai object create kora lagse
        ob1.display1();

        Test.display2();//static tai object create kora lage nai
    }
}
