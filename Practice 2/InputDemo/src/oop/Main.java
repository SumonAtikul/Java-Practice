package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number: ");
        num = input.nextInt();

        double num1;
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter any number: ");
        num1 = input2.nextDouble();

        String s;
        Scanner input1 = new Scanner(System.in);
        s = input1.nextLine();

        System.out.println(+num);
        System.out.println(s);
        System.out.println(num1);
    }
}
