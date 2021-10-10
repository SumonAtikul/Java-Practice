package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x=20, y=-10, result;
        result = Math.min(x, y);
        System.out.println(result);

        result = Math.max(x, y);
        System.out.println(result);

        int abs = Math.abs(y);
        System.out.println(abs);

        double pow = Math.pow(x, y);
        System.out.println(pow);

        ///https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html(all Math Class here)
    }
}
