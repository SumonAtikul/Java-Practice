package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        int num1, num2;
        num1=input.nextInt();
        num2=input.nextInt();

        int num3=num1+num2;
        System.out.println(num3);

        int num4=num1-num2;
        System.out.println(num4);

        int num5=num1*num2;
        System.out.println(num5);

        double num6=num1/num2;
        System.out.println(0.2+num6);

        int num7=num1%num2;
        System.out.println(num7);


    }
}
