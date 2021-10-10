package sumon;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Centralbank bank = new EBL();
        System.out.println("Total income of EBL yearly: "+bank.income());
    }
}
