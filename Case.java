import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //.trim removes all the extra space

        char ch = in.next().trim().charAt(0);
        if( ch >= 'a' && ch<= 'z'){
            System.out.println("lower case");
        }
        System.out.println(ch);
    }
}
