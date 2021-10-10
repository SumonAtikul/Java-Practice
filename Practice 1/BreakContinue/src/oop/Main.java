package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=0; i<9; i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }

        System.out.println("CONTINUE");

        for(int j=0; j<9; j++)
        {
            if(j==5)
            {
                continue;
            }
            System.out.println(j);
        }
    }
}
