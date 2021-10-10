package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        double c, far;
        System.out.print("Enter C: ");
        c=input.nextDouble();
        System.out.println("Enter f: ");
        far=input.nextDouble();

        double f=1.8*c+32;

        System.out.println("F= "+f);

        double cel=0.5*far-32;

        System.out.println("C= "+cel);
    }
}
