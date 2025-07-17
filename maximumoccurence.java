package Collectionframework;

import java.util.*;

public class maximumoccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,4,4,4,4};
        Map<Integer,Integer> freq= new HashMap<>();
        for(int al:arr){
            if(!freq.containsKey(al)){
                freq.put(al,1);
            }
            else{
                freq.put(al,freq.get(al)+1);
            }
        }
        System.out.println(freq.entrySet());
        int max = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
//        for(int a: freq.keySet()){
//            if(freq.get(a)>max){
//                max = freq.get(a);
//
//            }
//        }
        for(var e: freq.entrySet()){
            if(e.getValue()>max){
                max = e.getValue();
                ans = e.getKey();
            }
        }
        System.out.println(ans);

    }
}
