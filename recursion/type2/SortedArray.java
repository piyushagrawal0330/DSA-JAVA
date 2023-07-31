public class SortedArray {
    static boolean sortedArray(int[] arr , int idx){
        if(arr.length-1==idx)
        return true;
        if(arr[idx]<=arr[idx+1])
        return sortedArray(arr, idx+1);
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sortedArray(arr,0));
    }
}
