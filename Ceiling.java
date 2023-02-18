public class Ceiling {
    // find the smallest number that is greater than or equal to target
    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        // if no ceiling
        if(target>arr[arr.length-1]) return-1;
        while(start<=end){
            //  find the middle element
            int mid = (start + end)/2;
            if(target <arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return start;

    }
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int ans  = ceiling(arr, 22);
        System.out.println(ans);
    }
}
