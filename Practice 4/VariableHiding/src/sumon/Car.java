package sumon;

public class Car {
    int limit;
    String name;
    Car(int limit, String name)
    {
        this.limit = limit;
        this.name=name;
    }

    void display()
    {
        System.out.println("speed: " +limit);
        System.out.println("car name: " +name);
    }
}
