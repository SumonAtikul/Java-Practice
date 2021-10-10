package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a, n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a= ");
        System.out.println("Enter n= ");
        a=input.nextInt();
        n=input.nextInt();

        a+=n;
        System.out.println(a);
        a-=n;
        System.out.println(a);
        a*=n;
        System.out.println(a);
        a/=n;
        System.out.println(a);
        a%=n;
        System.out.println(a);

    }
}
