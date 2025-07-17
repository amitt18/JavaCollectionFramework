package Collectionframework;

import java.util.*;

public class Hashmap {
    static void Hashmapmethod(){
        Map<String,Integer> mp = new HashMap<>();
        mp.put("akas",21);
        mp.put("yash",16);
        mp.put("lov",17);
        mp.put("rishika",19);
        mp.put("marry",18);
        System.out.println(mp.get("lov"));
        mp.put("akash",25);
        System.out.println(mp.get("akash"));
        mp.remove("akash");
        System.out.println(mp.get("akash"));
        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());
        for(String key:mp.keySet()) {
            System.out.printf("age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
            for(Map.Entry<String,Integer> e: mp.entrySet()){
                System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
            }

    }
    public static void main(String[] args) {
        Hashmapmethod();
    }
}
