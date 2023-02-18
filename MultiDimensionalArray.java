import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class MultiDimensionalArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        int[][] arr = new int[3][3];
        // int[][] arr= {{1,2,3},{4,5},{6,7,8,9}}

        // input of an array
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++)
        System.out.println(Arrays.toString(arr[i]));
    }
}