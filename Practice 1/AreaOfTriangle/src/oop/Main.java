package oop;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        double b, h;
        System.out.print("enter b: ");
        b=input.nextDouble();
        System.out.print("enter h: ");
        h=input.nextDouble();

        double area=0.5*b*h;
        System.out.println(area);



    }
}
