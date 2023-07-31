public class MergeSort {
    //  time complexity nlogn
    public static void conquer(int[] arr,int si,int mid,int ei){
        int[] merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x= 0;
        // o(n)
        while(idx1<= mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++] = arr[idx1++];
                
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]= arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]= arr[idx2++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }

    }
    public static void divide(int[] arr ,int si,int ei){
        // logn
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;//if si and ei are greate than their result sometimes may be out of bound so to avoid this we prefer this
        divide(arr, si, mid);
        divide(arr, mid+1,ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int [] arr = {6,3,5,2,9,8};
        int n = arr.length;
        divide(arr,0,n-1);
        // print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
