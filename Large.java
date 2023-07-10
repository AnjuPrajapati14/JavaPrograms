import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int q = in.nextInt();
        // find the largest of three number
//        int max=a;
//        if (b>max){
//            max= b;
//        } if( c>max){
//            max= c;
//        }
//
//        System.out.println(max);
        int maxi =Math.max(q, Math.max(x,y));
        System.out.println(maxi);
    }

}
