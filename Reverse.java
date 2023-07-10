public class Reverse {
    public static void main(String[] args) {
        int n =  23456;
        int ans=0;
        while(n>0){
           int rem = n%10;
           ans = rem + 10*ans;
            n = n/10;
        }
        System.out.println(ans);
    }
}
