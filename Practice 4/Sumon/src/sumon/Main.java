package sumon;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Address address = new Address("Sylhet", "Bangladesh", 112 );
        Employee employee = new Employee(122, "Sumon", address);
        employee.display();

    }
}
