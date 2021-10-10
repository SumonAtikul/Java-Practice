package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OverloadTest ob = new OverloadTest();
        ob.add();

        ob.add(10, 20);


        ob.add(10.0 , 20.0);


        ob.add(10 , 20, 30);


    }
}
