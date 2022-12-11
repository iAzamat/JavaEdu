package Homeworks.Java04;

/*
https://leetcode.com/problems/simplify-path/
 */

import java.util.Deque;
import java.util.LinkedList;

public class Task71 {
    public static void main(String[] args) {
        String path1 = "/home/";
        System.out.println("Example 1: " + simplifyPath(path1));
        String path2 = "/../";
        System.out.println("Example 2: " + simplifyPath(path2));
        String path3 = "/home//foo/";
        System.out.println("Example 3: " + simplifyPath(path3));
    }

    public static String simplifyPath(String path) {
        Deque<String> deq = new LinkedList<>();
        String[] tokens = path.split("/");
        for (var token : tokens) {
            if ("..".equals(token)) {
                if (!deq.isEmpty()) {
                    deq.pollLast();
                }
            } else if (!"".equals(token) && !".".equals(token)) {
                deq.addLast(token);
            }
        }
        if (deq.isEmpty()) {
            return "/";
        }

        StringBuilder ans = new StringBuilder();
        while (!deq.isEmpty()) {
            ans.append("/").append(deq.pollFirst());
        }
        return ans.toString();
    }
}

// split по "/". Что будет если сделать сплит по ///
// если две  точки (может быть нечего доставать) или одна точка
// значит это имя папки
