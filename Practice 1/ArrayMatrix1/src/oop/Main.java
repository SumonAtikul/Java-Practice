package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);

        int a[][] = new int[2][3];
        int b[][] = new int[2][3];

        System.out.println("Enter A: ");

        //getting input for A matrix
        for(int row=0; row<2; row++)
        {
            for(int col=0; col<3; col++)
            {
                System.out.printf("A[%d][%d]= ", row, col);
                a[row][col] = input.nextInt();

            }
        }

        System.out.println("Enter B: ");

        //getting input for B matrix
        for(int row=0; row<2; row++)
        {
            for(int col=0; col<3; col++)
            {
                System.out.printf("B[%d][%d]= ", row, col);
                b[row][col] = input.nextInt();

            }
        }

        //printing A matrix
        System.out.print("A= ");
        for(int row=0; row<2; row++)
        {
            for(int col=0; col<3; col++)
            {
                System.out.print("\t "+a[row][col]);


            }
            System.out.println();
        }

        System.out.println("\n");
        //printing B matrix
        System.out.print("B= ");
        for(int row=0; row<2; row++)
        {
            for(int col=0; col<3; col++)
            {
                System.out.print("\t "+b[row][col]);


            }
            System.out.println();
        }

        //Addition A & B matrix
        System.out.println("A+B= ");
        for(int row=0; row<2; row++)
        {
            for(int col=0; col<3; col++)
            {
                System.out.print("\t "+(a[row][col]+b[row][col]));

            }
            System.out.println();
        }
    }
}
