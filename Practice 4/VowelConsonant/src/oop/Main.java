package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        char c;
        System.out.print("Enter char: ");
        c = input.next().charAt(0);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            System.out.println("VOWEL!!!");
        }

        else
        {
            System.out.println("CONSONANT!!!");
        }

    }
}
