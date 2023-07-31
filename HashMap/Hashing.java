import java.util.*;


public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        // insertion
        map.put("India ",120);
        map.put("USA",30);
        map.put("China ",150);

        System.out.println(map);

        map.put("China ", 180);
        System.out.println(map);

        // searching
        if(map.containsKey("China "))
        System.out.println("key is present in the map");
        else 
        System.out.println("key is not present in the map");

        // get function -- return value of key
        System.out.println(map.get("China ")); // if present
        System.out.println(map.get("Indonesia"));  // if not present return null


        // iteraton of hash map
        for(Map.Entry<String,Integer> e: map.entrySet() ){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // second iteration method
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        // remove
        map.remove("China ");
        System.out.println(map);
    }
}
