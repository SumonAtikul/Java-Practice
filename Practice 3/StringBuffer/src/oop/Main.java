package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String s1="Atikul";
        //StringBuffer  sb = new StringBuffer(s1);
        StringBuffer  sb = new StringBuffer("Atikul");
        System.out.println(sb);

        sb.append(" Islam ");
        sb.append(122);

        System.out.println(sb);

        /*sb.reverse();
        System.out.println(sb);*/

        /*sb.delete(0, 6);
        System.out.println(sb);*/

        sb.setLength(6);
        System.out.println(sb);

    }
}
