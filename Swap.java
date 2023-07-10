public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //swap numbers code
//        int temp = a;
//        a=b;
//        b=temp;
        swap(a,b);
        System.out.println(a +" "+b);

        String name ="adf";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "rahul ";  // we are not changing object ; instead creating
    }

    static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;

    }
}
