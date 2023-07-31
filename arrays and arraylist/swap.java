import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = { 1,3,23,9,28};
        swap(arr,1,3);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr)); 
    }
    static void swap(int[] arr ,int i , int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;

    }
}
