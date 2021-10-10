package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "Atikul Islam";//system 1
        String s2 = new String("atikul Islam");//system 2

        System.out.println(s1);
        System.out.println(s2);

        int len = s1.length();
        System.out.println("length of s1: "+len);

        if(s1==s2)//value compare kore na tai not equals dekhay
        {
            System.out.println("EQUALS");
        }
        else
        {
            System.out.println("NOT EQUALS");
        }

        if(s1.equals(s2))
        {
            System.out.println("EQUALS");
        }
        else
        {
            System.out.println("NOT EQUALS");
        }

        //upper case lower case ignore korbe
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("EQUALS");
        }
        else
        {
            System.out.println("NOT EQUALS");
        }

        //contains method
        boolean con = s1.contains("Islam");
        System.out.println(con);

        //isEmpty method if s2 is empty return 2 otherwise false
        boolean b=s2.isEmpty();
        System.out.println(b);
    }
}
