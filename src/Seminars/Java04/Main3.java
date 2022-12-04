package Seminars.Java04;

import java.util.Deque;
import java.util.LinkedList;

public class Main3 {
    public static void main(String[] args) {
        // abc/foo/bar/..
        Deque<String> deque = new LinkedList<>();
        deque.addLast("abc");
        deque.addLast("foo");
        deque.addLast("bar");
        deque.addLast("..");
        // елси две точки
        deque.pollLast();

        while (!deque.isEmpty()) {
            System.out.println(deque.pollLast());
        }
    }
}
