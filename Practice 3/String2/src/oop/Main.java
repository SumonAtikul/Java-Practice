package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstName = "Atikul";
        String lastName = " Islam";
        String fullName = firstName + lastName;

        System.out.println("Full name: "+fullName);

        //concat method
        String FullName = firstName.concat(lastName);
        System.out.println("Full name: "+FullName);

        //toUpperCase method
        String upper = fullName.toUpperCase();
        System.out.println("Upper Case Name: "+upper);

        //toLowerCase method
        String lower = fullName.toLowerCase();
        System.out.println("Lower Case Name: "+lower);

        //startWith method
        boolean b = firstName.startsWith("Ab");
        System.out.println(b);

        //endsWith method
        boolean l = lastName.endsWith("am");
        System.out.println(l);

        String[] names ={"sobuj", "sumon", "Islam"};
        for(String i:names)
        {
            System.out.println(i);
        }
    }
}
