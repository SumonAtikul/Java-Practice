package oop;

public class Vehicle {

    String color;
    int weight;
    Vehicle(String c, int w)
    {
        color=c;
        weight=w;

    }
    void attribute()
    {
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
    }

}
