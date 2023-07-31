import java.util.*;
public class HashMapQuestions {
    // 1st ques letcode 225 majority element
    //  2nd union of two arrays

    public static int union(int arr1[],int arr2[]){
        HashSet<Integer> map = new HashSet<>();

        for(int i : arr1){
            if(!map.contains(i))
            map.add(i);
        }
        for(int i : arr2){
            if(!map.contains(i))
            map.add(i);
        }

        return map.size();
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println(union(arr1,arr2));
    }
}
