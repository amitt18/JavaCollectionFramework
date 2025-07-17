package Collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListInterfaceExample {
    static void ArrayList(){
//        ArrayList<Integer> l = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);   // 1 2 3 4 5
        l.remove(1);
        System.out.println(l);  // 2 3 4 5
        System.out.println(l.contains(6));  // false
        System.out.println(l.get(3));   // 4
        l.set(2,10);
        System.out.println(l);     // 2 10 3 4 5
    }
    public static  void StackExample(){
        Stack<Integer> st  = new Stack<>();
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.contains(13));
        st.pop();
        System.out.println(st);
    }

    public static void main(String[] args) {
ArrayList();
        System.out.println("stack method");
StackExample();
    }
}
