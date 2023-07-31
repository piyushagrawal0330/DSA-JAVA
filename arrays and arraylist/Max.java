import java.util.*;
public class Max {
    public static void main(String[] args) {
        int[] arr = { 1,3,23,9,2};
        System.out.println(max(arr)); 
        
    }
    static int max(int[] arr ){
        int max = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>max)
            max = arr[i+1];
        }
        return max;

    }
}
