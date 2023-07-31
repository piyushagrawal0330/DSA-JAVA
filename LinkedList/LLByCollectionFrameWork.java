import java.util.LinkedList;

public class LLByCollectionFrameWork {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("list");
        System.out.println(list);
        list.addFirst("this");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.remove(1);//remove list element at that position it is 0-indexed
        System.out.println(list);
    }
}
