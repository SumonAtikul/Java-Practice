package oop;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> number=new ArrayList<>();

        number.add(10);
        number.add(-3);
        number.add(4);
        number.add(60);
        number.add(0);
        number.add(2);
        System.out.println("Before Sorting: "+number);

        //Ascending order
        Collections.sort(number);
        System.out.println("After Sorting in Ascending order: "+number);

        //Descending order
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After Sorting in Descending order: "+number);


    }
}
