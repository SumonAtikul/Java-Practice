package oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        int m, n, count=0, total=0;
        System.out.println("ENTER M: ");
        m=input.nextInt();
        System.out.println("ENTER N: ");
        n=input.nextInt();

        for(int i=m; i<=n; i++)
        {
            for(int j=2; j<=i-1; j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0) {

                System.out.println(i);
                total++;
            }
                count=0;   //aktar check korar pore jate count abar 0 hoye jay tai


        }
        System.out.println("TOTAL: "+total);
    }
}
