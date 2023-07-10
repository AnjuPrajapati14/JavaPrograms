public class Overloading {
    public static void main(String[] args) {
        fun(3); // the fun which take intergers while compile  time this happen

        fun("anju"); //when two function have same name but different type of arguments
    }

    static void fun(int a) {
        System.out.println(a);
    }

      static void fun(String name) {
          System.out.println(name);
    }

}
