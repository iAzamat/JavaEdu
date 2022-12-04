package Seminars.Java05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TaskOne {
    public static void main(String[] args) {
        // HASHMAP / SET
        // быстрый доступ по ключу
        // ключ - значение
        String text = "a a a akkk kkkkk kkfff jjjj fjdfjk jk jkjk ";
        String[] textArray = text.split("\\s");
        Map<String, Integer> counter = new HashMap<>(); // доступ по ключу O(1)
        for (String word : textArray) {
//            if (!counter.containsKey(word)) {
//                counter.put(word, 1);
//            } else {
//                counter.put(word, counter.get(word) + 1);
//                // при обновлении счетчика будьте уверены, что у вас такой ключ есть
//            }
            counter.putIfAbsent(word, 0);
            counter.put(word, counter.get(word) + 1);
        }
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(5);
        System.out.println(set.contains(5));
    }
}
