import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
        Syntax of for loops:
        for(initialisation; condition; increment/decrement){
        //body
        }
         */

        // Q: print number from 1 to 5
        for(int i =1; i<=5; i++){
            System.out.println(i);
        }

        // print from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0; i<n; i++){
            System.out.println(i + "");
        }
        // while loop

        // use while when you dont know how many times the statement is to run


        /*

        while(condition){
        //body
        }
         */
        int num=1;
        while(num<=5){
            System.out.println(num);
            num++;
        }

        // do while loop
        /*
        do{
        //body
        } while(condition);
         */
        int m=1;
        do{
            System.out.println("hello moto");
        } while(m!=1);

    }
}
