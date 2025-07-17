package Collectionframework;

import java.util.*;

public class validAnagram {
//    public static boolean isvalid(String s1, String s2) {
//        if (s1.length() != s2.length()) return false;
//        int[] freq = new int[26];
//        for (int i = 0; i < s1.length(); i++) {
//            freq[s1.charAt(i) - 'a']++;
//            freq[s2.charAt(i) - 'a']--;
//        }
//        for (int count : freq) {
//            if (count != 0) return false;
//        }
//        return true;
//    }
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 ="listen";
        String s2 = "silenr";
        // System.out.println(isvalid(s1,s2));
        System.out.println(isAnagram(s1,s2));

    }
}