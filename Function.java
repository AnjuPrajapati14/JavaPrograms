import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        //  ques: take input of two numbers and print the sum
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int a = in.nextInt();
        System.out.println("enter other number");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println(" the sum:  " + sum);

        */

      //  sum();  // calling
        // int ans = sum2();
      //  System.out.println(ans);

      //  Greeting();

        // string function
        String ab = greet();
        System.out.println(ab);
    }

    //return a value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int a = in.nextInt();
        System.out.println("enter other number");
        int b = in.nextInt();
        int sum = a + b;
        return sum;

        // after return statement nothing will be executed in that particular function
    }

    static void sum()

    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int a = in.nextInt();
        System.out.println("enter other number");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println(" the sum:  " + sum);


         /*

       access modifier ( we'll  look in OOPs )
        return_type name (){
        //body
        return statement;
        }

        */
    }

    static  void Greeting(){
        System.out.println("hello world ");

    }

    static String greet(){
        String ab = "my name is...";

        return ab;
       // return "hi";
    }



}







