package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = " This_is_my country";
        String s2 = s.replace('i', 'j');
        System.out.println(s2);

        String[] s3 = s.split("_");
        for(String i:s3)
        {
            System.out.print(i);
        }
    }
}
