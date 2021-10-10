package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double n, sum = 0;
        n = input.nextDouble();

        for(double i=1.5; i<=n; i+=2)
        {
            sum+=i;
            System.out.println(i);

        }
        System.out.println(sum);
    }
}
