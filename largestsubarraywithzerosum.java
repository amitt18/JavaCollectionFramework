package Collectionframework;
import java.util.*;
public class largestsubarraywithzerosum {
    int zerosubsum(int[] arr,int n){
        HashMap<Integer,Integer> mp = new HashMap();
          int maxlen = 0;
          int presum =0;
          mp.put(0,-1);
          for(int i=0;i<arr.length;i++){
           presum+=arr[i];
           if(mp.containsKey(presum)){
               maxlen = Math.max(maxlen,i-mp.get(presum));
           }
           else{
               mp.put(presum,i);
           }
          }
          return maxlen;
    }
}
