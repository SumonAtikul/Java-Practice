package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        int c=a&b;

        System.out.println("a&b: "+c);

        int d= a|b;
        System.out.println("a|b: "+d);

        int e = a^b;
        System.out.println("a^b: "+e);

        int f= a<<b;
        System.out.println("a<<b: "+f);

        int g=a>>b;
        System.out.println("a>>b: "+g);

    }
}
