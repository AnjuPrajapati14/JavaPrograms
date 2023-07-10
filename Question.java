import java.util.Scanner;

public class Question {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
       // System.out.println(isPrime(n));
        System.out.println(isArmstrong(n));
    }
    //print amstrong number 3 digit
    //153 = 1cube + 5cube + 3cube = number only
    static boolean isArmstrong (int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum = sum+rem*rem*rem;

        }
        return sum==original;
    }
    private static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(c*c >n){
            return true;
        }
        return false;


    }
}
