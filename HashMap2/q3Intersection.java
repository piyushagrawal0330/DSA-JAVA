import java.util.*;
public class q3Intersection {
    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer> map = new HashSet<>();

        for(int i : arr1){
            if(!map.contains(i))
            map.add(i);
        }
        int c=0;
        for(int i : arr2){
            if(map.contains(i)){
                map.remove(i);
                c++;
            }   
        }

        return c;
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println(intersection(arr1,arr2));
    }
}
