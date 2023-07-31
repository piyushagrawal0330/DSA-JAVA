import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>();//here in object part write integer is not necessary
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        

        // System.out.println(list.contains(67)); //return true if element is present in arraylist
        // list.set(0,99);//set element in list
        // list.remove(2);//remove element by index
        // System.out.println(list);

        // input
        for(int i = 0;i<6;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        // Get item at any index
        for(int i = 0;i<6;i++){
            System.out.println(list.get(i)); //pass index,list[index] not work here
        }

    }
    
}
