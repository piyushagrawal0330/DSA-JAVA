import java.util.*;

public class c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j]= sc.nextInt();
            }
            int minDiff = Integer.MAX_VALUE;
            for(int j=0;j<n-1;j++){
                if(arr[j+1]-arr[j]<minDiff){
                    minDiff=arr[j+1]-arr[j];
                }
            }
            if(minDiff<0){
                System.out.println(0);
            }
            else{
                System.out.println((minDiff/2)+1);
            }
        }
    }

}
