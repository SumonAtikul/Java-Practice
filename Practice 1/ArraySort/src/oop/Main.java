package oop;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {10, -2, 3, 4, 5};
        int len = a.length;
        System.out.println("length= "+len);

        System.out.println();


        Arrays.sort(a);
        for(int i=0; i<5; i++)
        {
            System.out.print(" "+a[i]);
        }

        System.out.println();

        for(int i=4; i>=0; i--)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();

        String[] name = {"sumon","hira", "ashfaque"};
        Arrays.sort(name);
        for(int i=0; i<3; i++)
        {
            System.out.println(" "+name[i]);
        }

        System.out.println();

        for(int i=2; i>=0; i--)
        {
            System.out.println(" "+name[i]);
        }
    }
}
