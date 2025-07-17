package Collectionframework;
import javax.print.DocFlavor;
import java.util.*;
public class HashSetex {
    static class MyHashMap<K,V>{
      public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;
        private void initBucket(int N){
               buckets = new LinkedList[N];
               for(int i=0;i<buckets.length;i++){
                   buckets[i]  = new LinkedList<>();
               }
        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%buckets.length;
        }
           private  int searchinbucket(LinkedList<Node> ll,K key){
                for(int i=0;i<ll.size();i++){
                    if(ll.get(i).key.equals(key)){
                        return i;
                    }
                }
                return -1;
           }
        public MyHashMap(){
            initBucket(DEFAULT_CAPACITY);
        }
        public int capacity(){
            return buckets.length;
        }
        public float loadfact(){
            return (n*1.0f)/buckets.length;
        }
        private   void rehash(){
            LinkedList<Node>[] oldbucket = buckets;
            initBucket(oldbucket.length*2);
            n=0;
            for(var bucket:oldbucket){
              for(var node:bucket){
                  put(node.key,node.value);
              }
            }
        }

        public int size(){
            return n;
        }
        public  void put(K key,V value){
         int bi = HashFunc(key);
         LinkedList<Node> currbucket = buckets[bi];
         int ei  = searchinbucket(currbucket,key);
         if(ei== -1){
             Node  node = new Node(key,value);
             currbucket.add(node);
             n++;
         }
         else{
             Node currNode = currbucket.get(ei);
             currNode.value = value;
         }
         if(n>=buckets.length*DEFAULT_LOAD_FACTOR){
             rehash();
         }
        }
        public V get(K key){
           int bi = HashFunc(key);
           LinkedList<Node> currbucket = buckets[bi];
           int ei = searchinbucket(currbucket,key);
           if(ei!= -1){
               Node currnode = currbucket.get(ei);
               return currnode.value;
           }
           return null;
        }
        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ei  = searchinbucket(currbucket,key);
            if(ei!= -1){
               Node currnode = currbucket.get(ei);
              V val = currnode.value;
              currbucket.remove(ei);
              n--;
               return val;

            }
            return  null;
        }


    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> mp = new MyHashMap<>();
        System.out.println("testing");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("d",4);
        mp.put("e",5);
        System.out.println("testing size "+mp.size());
        mp.put("c",33);
        System.out.println("testing size "+mp.size());
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("d"));
        System.out.println(mp.get("college"));
        System.out.println(mp.remove("c"));
        System.out.println(mp.size());
        System.out.println(mp.remove("c"));
        System.out.println(mp.capacity());
        System.out.println(mp.loadfact());
    }
}
