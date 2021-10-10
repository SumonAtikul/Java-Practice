package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        int num, r, temp, sum=0;
        num = input.nextInt();

        temp=num;
        while(temp!=0)
        {
            r = temp%10;
            sum = sum*10+r;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("NOT");
        }

    }
}
