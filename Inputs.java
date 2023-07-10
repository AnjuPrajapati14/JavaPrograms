import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                int rollno = input.nextInt();
               // int a = input.next();
        System.out.println("your roll no " + rollno );
//        Scanner input = new Scanner(System.in);
        String name =input.next();
        System.out.println(name);
        int x = input.nextInt();

        System.out.println(x);
        char c = 67;
        byte b = 23;
        int a = 12;
        float f = 23.2322f;
        double d = 23.23232;
        short s = 12;
        double result = (f*b) + ( a/c) + (d - s);
        System.out.println(result);
        System.out.println((f*b) + " " + (f/c) + " " + (d-s));
        int ab = 257;
        byte ba = (byte)(ab);
        System.out.println(ba);
    }
}
