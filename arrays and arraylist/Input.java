import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // array of primitives
        // int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 233;
        // arr[3] = 543;
        // arr[4] = 3;
        // System.out.println(arr[3]);

        // // input using for loops
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // // using enhanced for loop
        // for(int i:arr){ //here i represents elements of an array
        //     System.out.print(i + " ");
        // }

        // // covert arr to string
        // System.out.println(Arrays.toString(arr));

        // arrays of objects
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
