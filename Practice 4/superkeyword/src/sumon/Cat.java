package sumon;

public class Cat extends Animal{
    String color = "Black";
    void eat()
    {
        System.out.println("Eating inside Cat class.......");
    }


    /*void printcolor()
    {
        System.out.println("Color of the cat is: "+super.color);
    }*/

    void callEatingMethod()
    {
        super.eat();
    }
    Cat()
    {
        super();
        System.out.println("Cat class called");
    }

}
