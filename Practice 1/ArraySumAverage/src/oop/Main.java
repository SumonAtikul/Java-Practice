package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = input.nextInt();
        double[] a = new double[size];
        System.out.print("Enter 5 numbers: ");
        double sum=0;

        for(int i=0; i<size; i++)
        {
            a[i]=input.nextDouble();
            sum+=a[i];
        }

        System.out.println("Sum: "+sum);
        System.out.println("Average: "+sum/size);

    }
}
