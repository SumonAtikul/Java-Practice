package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int first=0;
        int second = 1;
        int fibo, sum=0;
        System.out.print(first+" "+second);

        for(int i=3; i<=n; i++) {
            fibo = first + second;

            System.out.print(" " + fibo);
            first = second;
            second = fibo;

        }

    }
}
