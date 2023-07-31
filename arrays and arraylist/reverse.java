import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int[] arr = { 1,3,23,9,28};
        reverse(arr);
        
        System.out.println(Arrays.toString(arr)); 
    }
    static void reverse(int[] arr ){
        for(int i =0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

    }
}
