package Seminars.Java04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(4);
        System.out.println(q.poll());
        System.out.println(q);

        Deque<Integer> deque = new LinkedList<>(); // хорошо
        Deque<Integer> deq = new ArrayDeque<>(); // плохо
        deque.push(5);
        deque.push(4);
        System.out.println(deque.poll());
        System.out.println(deque);
        // ctrl+lkm
    }
}
