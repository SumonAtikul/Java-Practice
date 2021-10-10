package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();

        person.setName("Sumon");
        person.getName();

        person.setAge(21);
        person.getAge();

        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
