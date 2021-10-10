package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int n, count=0;
        n = input.nextInt();

        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                count++;
                break;

            }
        }

        if(count==0)
        {
            System.out.println("PRIME NUMBER!!!");
        }
        else
        {
            System.out.println("NOT PRIME!!!");
        }
    }
}
