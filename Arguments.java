public class Arguments {
    public static void main(String[] args) {
        // arguments in function
        int ans = sum3(20,2);
        System.out.println(ans);

        String hello= greet();
        System.out.println(hello);

        String person = myGreet("Anju Prajapati");
        System.out.println(person);

    }

    private static String myGreet( String name) {
        String msg = "hello " + name;
        return msg;
    }
    // if we don't want to put scanner again and again, pass the value of number when calling the method in main
     // pass the value of numbers when you are calling the method in main()

    //return the value
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

    static String greet(){
        String greeting = "hows u";
        return greeting;
    }
}
