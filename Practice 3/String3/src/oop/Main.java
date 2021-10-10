package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String country = "    Bangladesh is my country   ";
        System.out.println(country);

        String s3 = country.trim();//first and last space remove
        System.out.println(s3);

        char ch = country.charAt(0);
        System.out.println(ch);

        int value = country.codePointAt(0);//0 index ascii value
        System.out.println("Value= "+value);

        int pos = country.indexOf('n');
        System.out.println("First position of n: "+pos);

        pos = country.lastIndexOf('n');
        System.out.println("Last index of n: "+pos);


    }
}
