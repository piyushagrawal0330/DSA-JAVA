import java.util.HashSet;
import java.util.Iterator;
public class Hashing{
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(9);
        set.add(4);
        set.add(3);
        set.add(1);

        // size
        System.out.println("size of set " + set.size());

        // print all elements
        System.out.println(set);

        // search Contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("set not contain");
        }

        // delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("it does not contain 1");
        }

        // iterator
        Iterator it = set.iterator();
        // it has two functions hasnext returns true or false ; next function at starting ithas null butit.next calls element;
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}