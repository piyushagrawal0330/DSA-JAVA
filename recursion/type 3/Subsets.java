import java.util.ArrayList;

public class Subsets {
    static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    static void subsets(int n,ArrayList<Integer> subset){

        if(n==0){
            printSubset(subset);
            return;
        }

        //  add hoga
        subset.add(n);
        subsets(n-1, subset);

        // add  nahi hoga
        subset.remove(subset.size()-1);
        subsets(n-1, subset);


    }
    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        subsets(3,subset);
    }
}
