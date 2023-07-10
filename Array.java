import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // store rollno. of 5 students
        /*
        syntax
        datatype[] variable_name = new datatype[size];     declaration

         */
      int[] ros; // declaration of array, ros is defined in stack
         ros = new int[5]; // actual obj is being created in heap

        int[] rnos = {1,2,6,3,4};
        for(int i =0; i<rnos.length; i++) {
            System.out.println(rnos[i]);
        }
        Scanner in = new Scanner(System.in);

//        int[] a = new int[5];
//        for(int i =0; i < a.length; i++){
//            a[i]= in.nextInt();
//        }
//        for(int i =0; i < a.length; i++){
//            System.out.println(a[i]);
//        }

        int[] arr = new int[7];
        for(int i =0; i<arr.length; i++){
            arr[i]= in.nextInt();
        }
//        for(int i=0; i<arr.length ; i++){
//            System.out.print(arr[i] + " ");
//        }
        // enhanced for loop
        for(int j:arr){ //for every element in array, print the array
            System.out.print(j + " "); //here j represents element of the array
        }

    }
}
