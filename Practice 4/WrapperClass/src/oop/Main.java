package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //primitive to object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        //or
        Integer z = x;
        System.out.println(z);//Integer.valueOf(x) autoboxing


        //object to primitive
        Double d = new Double(10.25);
        System.out.println(d);

       //double e = d.doubleValue();
        double e = d;  //d.doubleValue()
        System.out.println(e);
    }
}
