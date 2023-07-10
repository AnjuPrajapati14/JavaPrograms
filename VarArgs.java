import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //when we dont know how many inputs we are giving
    fun(2,343,45,2,23,17);
    multiple(2,3,2,3,44,65,34);

    }
    static void multiple(int a, int b, int ...v){ //variable argument should be in end
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){ //array of integers or  (String ...v) array of string
        System.out.println(Arrays.toString(v));
    }
}
