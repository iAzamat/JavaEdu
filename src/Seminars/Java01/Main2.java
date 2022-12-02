package Seminars.Java01;

public class Main2 {
    // имя файла должно совпадать с именем класса (public)
    // классы называются в стиле CamelCase
    public static void main(String[] args) throws Exception {
    }
}


//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

//        class Solution {
//            public int subtractProductAndSum(int n) {
//                int prod = 1;
//                int sum = 0;
//                while (n > 0) {
//                    prod *= (n % 10);
//                    sum += n % 10;
//                    n /= 10;
//                }
//                return prod - sum;
//            }
//        }


//https://leetcode.com/problems/add-binary/

//class Solution {
//    public String addBinary(String a, String b) {
//        if (a.length() > b.length()) {
//            String t = a;
//            a = b;
//            b = t;
//        }
//        int i = a.length() - 1;
//        int car = 0;
//        StringBuilder sb = new StringBuilder();
//        for (int j = b.length() - 1; j >= 0; j--) {
//            if (b.charAt(j) == '1') {
//                car++;
//            }
//            if (i >= 0 && a.charAt(i) == '1') {
//                car++;
//            }
//            sb.append(car % 2);
//            i--;
//            car /= 2;
//        }
//        if (car == 1) {
//            sb.append(car);
//        }
//        return sb.reverse().toString();
//    }
//}


//https://leetcode.com/problems/merge-strings-alternately/

//class Solution {
//    public String mergeAlternately(String word1, String word2) {
//        StringBuilder sb = new StringBuilder();
//
//        int i = 0;
//
//        while (i < word1.length() || i < word2.length()) {
//            if (i < word1.length()) {
//                sb.append(word1.charAt(i));
//            }
//            if (i < word2.length()) {
//                sb.append(word2.charAt(i));
//            }
//            i++;
//        }
//        return sb.toString();
//    }
//}


//https://leetcode.com/problems/move-zeroes/

//class Solution {
//    public void moveZeroes(int[] nums) {
//        int copyInd = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[copyInd] = nums[i];
//                copyInd += 1;
//            }
//
//        }
//
//        while (copyInd < nums.length) {
//            nums[copyInd++] = 0;
//        }
//    }
//}