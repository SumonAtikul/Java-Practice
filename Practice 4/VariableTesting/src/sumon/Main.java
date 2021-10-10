package sumon;

public class Main {

    int id; //instance variable
    static String name = "LU"; //static or class variable

    void sum(int a, int b){
        int result = a+b;//local
        System.out.println(result);

    }

    public static void main(String[] args) {

        int a=10; //local variable
	// write your code here
        Main main = new Main();
        Main main2 = new Main();

        main.id = 122;
        main2.id =123;

        System.out.println(main.id +" "+main2.id);
        System.out.println(Main.name); //static

        System.out.println(a);

        Main main3 = new Main();
        main3.sum(12, 13);
    }
}
