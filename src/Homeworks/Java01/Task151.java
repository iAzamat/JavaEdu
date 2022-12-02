package Homeworks.Java01;

/*
https://leetcode.com/problems/reverse-words-in-a-string/
 */

public class Task151 {
    public static void main(String[] args) throws Exception {
        String s = "the sky is blue";
        System.out.println(s);
        s = reverseWords(s);
        System.out.println(s);
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end -= 1;
                continue;
            }

            int start = end - 1;

            while (start >= 0 && s.charAt(start) != ' ') {
                start -= 1;
            }
            sb.append(" ");
            sb.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

}