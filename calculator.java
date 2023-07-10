import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user
        int ans = 0;
        while(true){
         // take operator as input
            System.out.println("enter operation:");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                System.out.println("enter two number:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();


                if (op == '+'){
                        ans = num1 +num2;
                  //  System.out.println(ans);
                }
                if (op == '-'){
                    ans = num1 - num2;
                 //   System.out.println(ans);
                }
                if (op == '*'){
                    ans = num1 * num2;
                    System.out.println(ans);
                }
                if (op == '/'){
                    if(num2!=0) {
                        ans = num1 / num2;
                       // System.out.println(ans);
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                   // System.out.println(ans);
                }
                else if(op== 'x' || op=='x'){
                    break;
                } else {
                    System.out.println(" ");
                }
                System.out.println(ans);




            }
        }

    }
}

/*  syntax of if statements:
 if (boolean expression T or F) {
 // body
 } else {
 // do this
 }


 */
