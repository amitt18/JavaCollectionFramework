package Collectionframework;

import java.util.*;

public class SetInterface {
    public static void HashSetEx(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(2);
        set.add(5);
        set.add(45);
        set.add(43);
        System.out.println(set);
       // set.remove(5);
       // System.out.println(set);
       // System.out.println(set.contains(40));
        //System.out.println(set.size());


    }
    public static void LinkedHashSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(2);
        set.add(5);
        set.add(45);
        set.add(43);
        System.out.println(set);
    }
    public static void TreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(24);
        set.add(36);
        set.add(41);
        set.add(47);
        set.add(2);
        set.add(5);
        set.add(45);
        set.add(43);
        System.out.println(set);
    }
    public static void main(String[] args) {
        HashSetEx();
        LinkedHashSet();
        TreeSet();
    }
}
