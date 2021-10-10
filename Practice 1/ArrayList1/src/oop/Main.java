package oop;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> number = new ArrayList<>();

        System.out.println("Size= "+number.size());

        //initialize array list using add method
        number.add(10);
        number.add(20);
        number.add(2, 30);
        number.add(3, 40);

        //System.out.println(number);//normal way print


        //print using for each loop
        /*for(int x: number)
        {
            System.out.print(" "+x);
        }
        System.out.println();*/

        System.out.print("Array list contains: ");

        //print using iterator
        Iterator itr = number.iterator();
        while(itr.hasNext()) //itr jotokkhon empty hobe na totokkhon cholte thakbe
        {
            System.out.print(itr.next()+" ");
        }

        System.out.println();

        //indexOf method
        int pos = number.indexOf(30);
        System.out.println("index of 30 is: "+pos);

        //contains method 20 is in the list?(return true or false)
        boolean value = number.contains(20);
        System.out.println("20 is in the list? "+value);

        //set method(replace value)
        number.set(3, 50);
        System.out.println("After setting: "+number);

        //get method
        int y = number.get(0);
        System.out.println("After getting index 0: "+y);

        //isEmpty method tru or false return (empty=true, empty!=false)
        System.out.println();
        boolean check=number.isEmpty();
        System.out.println("Array list empty: "+check);

        System.out.println();

        System.out.println("Size= "+number.size());

        //Removing Elements
        number.remove(1);
        System.out.println("After removing: "+number);

        //Removing All
        number.removeAll(number);
        System.out.println("After remove all: "+number);

        //clear method
        number.clear();
        System.out.println("After clear: "+number);

        //isEmpty method tru or false return (empty=true, empty!=false)
        boolean check1=number.isEmpty();
        System.out.println("Array list empty: "+check1);

        //contains method 20 is in the list?(return true or false)
        boolean value1 = number.contains(20);
        System.out.println("20 is in the list? "+value1);
    }
}
