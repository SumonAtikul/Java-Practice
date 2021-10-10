package oop;

public class Car extends Vehicle{

    int gear;
    Car(String c, int w, int g)
    {
        super(c, w); //calling the constructor of vehicle class
        gear = g;
    }

    @Override
    void attribute()
    {
        super.attribute();
        System.out.println("Gear: "+gear);
    }


}
