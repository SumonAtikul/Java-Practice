package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = input.nextInt();
        double[] a = new double[size];

        for(int i=0; i<size; i++)
        {
            a[i] = input.nextDouble();
        }

        double max = a[0];
        for(int i=0; i<size; i++) {
            if (a[0] < a[i]) {
                max=a[i];

            }
        }

        System.out.println("Max: "+max);

        double min = a[0];
        for(int i=0; i<size; i++) {
            if (a[0] > a[i]) {
                min=a[i];

            }
        }
        System.out.println("Min: "+min);


    }
}
