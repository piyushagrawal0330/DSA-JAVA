public class code {
    public static void main(String[] args) {
        int arr[] = {23,45,1,8,19,3,16,-11,28};
        int target=19;
        System.out.println(linearSearch(arr,target));
    }

    // search in the array: return the index if found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run for a loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every indexif it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}