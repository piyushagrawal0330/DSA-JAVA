public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {23,45,1,8,19,3,16,-11,28};
        int target=19;
        System.out.println(linearSearch(arr,target,2,6));
    }

    
    static int linearSearch(int[] arr, int target,int a ,int b) {
        if (arr.length == 0) {
            return -1;
        }
        // run for a loop
        for (int index = a; index <=b; index++) {
            // check for element at every indexif it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
