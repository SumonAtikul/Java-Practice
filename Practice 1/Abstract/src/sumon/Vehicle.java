package sumon;

public abstract class Vehicle {

    Vehicle()
    {
        System.out.println("Vehicle class called");
    }

    void speedLimit()
    {
        System.out.println("Please control your speed limit");
    }

    //abstract method
    abstract void run();
}
