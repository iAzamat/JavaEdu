package Homeworks.Java05;

/*
https://leetcode.com/problems/roman-to-integer/
 */

import java.util.HashMap;

public class Task13 {
    public static void main(String[] args) {
        String s1 = "III";
        System.out.println("Example 1: " + romanToInt(s1));

        String s2 = "LVIII";
        System.out.println("Example 2: " + romanToInt(s2));

        String s3 = "MCMXCIV";
        System.out.println("Example 3: " + romanToInt(s3));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i));
            } else {
                sum -= map.get(s.charAt(i));
            }
        }

        sum += map.get(s.charAt(s.length() - 1));

        return sum;
    }
}


//class Solution {
//    public int romanToInt(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//
//        int sum = 0;
//
//        for (int i = 0; i < s.length() - 1; i++) {
//            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
//                sum += map.get(s.charAt(i));
//            } else {
//                sum -= map.get(s.charAt(i));
//            }
//        }
//
//        sum += map.get(s.charAt(s.length() - 1));
//
//        return sum;
//    }
//}