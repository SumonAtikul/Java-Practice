package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        int size = input.nextInt();
        int size1 = input.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i] = input.nextInt();

            System.out.println(arr[i]);
        }

        char c[] = new char[size1];
        for(int i=0; i<size1; i++)
        {
            c[i] = input.next().charAt(0);

            System.out.println(c[i]);
        }




    }
}
