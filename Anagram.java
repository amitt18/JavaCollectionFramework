package Collectionframework;

import java.util.*;

public class Anagram {
    public  static boolean isAnagram(String s1,String s2){
        if (s1.length()!=s2.length()) return  false;
        Map<Character,Integer> mp1 = new HashMap<>();
        Map<Character,Integer> mp2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            Character  ch = s1.charAt(i);
            if(!mp1.containsKey(ch)){
                mp1.put(ch,1);
            }
            else{
                int curr = mp1.get(ch);
                mp1.put(ch,curr+1);
            }
        }
        for(int i=0;i<s2.length();i++){
            Character ch = s2.charAt(i);
            if(!mp2.containsKey(ch)){
                mp2.put(ch,1);
            }
            else{
                int curr = mp2.get(ch);
                mp2.put(ch,curr+1);
            }
        }
      return mp1.equals(mp2);
    }
    public static void main(String[] args) {
            String s1 = "amit";
            String s2= "mita";
        System.out.println(isAnagram( s1, s2));
    }
}
