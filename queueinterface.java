package Collectionframework;

import java.util.*;

public class queueinterface {
    public static void QueueExample(){
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.addLast(20);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.peek();
        System.out.println(q.isEmpty());
        System.out.println(q.contains(20));
    }
    public static void main(String[] args) {
        QueueExample();
    }
}
