package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] name = {"Atikul", "Islam", "Sumon"};

        for(String i:name)
        {
            System.out.println(i);
        }

        int[] a={100,200,300};
        int sum=0;
        for(int i:a)
        {
            sum+=i;
            System.out.println(i);

        }
        System.out.println(sum);
    }
}
