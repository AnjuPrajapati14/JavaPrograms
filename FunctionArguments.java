import java.util.Scanner;

public class FunctionArguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);


    }

    private static  String myGreet(String name) {
        String msg = "Helllo " + name;
        return msg;
    }
}
