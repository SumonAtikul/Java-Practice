package sumon;

public class Employee {
    int id;
    String name;
    Address address;
    Employee(int id, String name, Address address)
    {
        this. id = id;
        this.name = name;
        this.address = address;
    }

    void display()
    {
        System.out.println("Name of the student is: "+name);
        System.out.println("ID of the student is: "+id);
        System.out.println("House number of the student is: "+address.houseNo);///has a relationship
        System.out.println("City name of the student is: "+address.city);
        System.out.println("Country of the student is: "+address.country);


    }
}
