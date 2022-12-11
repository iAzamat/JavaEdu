package Homeworks.Java05;

/*
https://leetcode.com/problems/count-common-words-with-one-occurrence/
 */

import java.util.HashMap;
import java.util.Map;

public class Task2085 {
    public static void main(String[] args) {
        String[] words1 = new String[]{"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = new String[]{"amazing", "leetcode", "is"};
        System.out.println("Example 1: " + countWords(words1, words2));

        String[] words12 = new String[]{"b", "bb", "bbb"};
        String[] words22 = new String[]{"a", "aa", "aaa"};
        System.out.println("Example 2: " + countWords(words12, words22));

        String[] words13 = new String[]{"a", "ab"};
        String[] words23 = new String[]{"a", "a", "a", "ab"};
        System.out.println("Example 3: " + countWords(words13, words23));
    }

    public static int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words1.length; i++) {
            map.putIfAbsent(words1[i], 0);
            map.put(words1[i], map.get(words1[i]) + 1);
        }

        int ans = 0;
        for (int i = 0; i < words2.length; i++) {
            if (map.containsKey(words2[i]) && map.get(words2[i]) < 2) {
                map.put(words2[i], map.get(words2[i]) - 1);
            }
        }
        for (var e : map.entrySet()) {
            if (e.getValue() == 0) {
                ans++;
            }
        }
        return ans;
    }
}

//class Solution {
//    public int countWords(String[] words1, String[] words2) {
//        if (words1.length > words2.length) {
//            return countWords(words2, words1);
//        }
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < words1.length; i++) {
//            map.putIfAbsent(words1[i], 0);
//            map.put(words1[i], map.get(words1[i]) + 1);
//        }
//
//        int ans = 0;
//        for (int i = 0; i < words2.length; i++) {
//            if (map.containsKey(words2[i]) && map.get(words2[i]) < 2) {
//                map.put(words2[i], map.get(words2[i]) - 1);
//            }
//        }
//        for (var e : map.entrySet()) {
//            if (e.getValue() == 0) {
//                ans++;
//            }
//        }
//        return ans;
//    }
//}
