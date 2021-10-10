package sumon;

public class Car {
    String name;
    int limit;
    //default constructor
    Car()
    {
        System.out.println("Car class object is created");

    }
    //parameterized constructor
    Car(int l)
    {
        limit = l;
        System.out.println("Speed limit: "+limit);
    }
    //constructor overloading
    Car(int l, String carName)
    {
        limit = l;
        name = carName;
    }
}
