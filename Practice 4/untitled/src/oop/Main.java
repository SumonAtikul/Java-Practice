package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int num;
        num=input.nextInt();
        if(num>0)
        {
            System.out.println("it is a positive number");
        }
        else if(num==0)
        {
            System.out.println("ZERO!!!");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}
