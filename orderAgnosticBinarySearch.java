public class orderAgnosticBinarySearch {
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        // find whether the array in ascendind or descending
        boolean isAsc = arr[start]<arr[end];
        
        while(start<=end){
            //  find the middle element
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
            if(target <arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        else{
            if(target >arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int ans  = binarySearch(arr, 22);
        System.out.println(ans);
    }
}