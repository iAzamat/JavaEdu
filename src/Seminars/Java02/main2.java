package Seminars.Java02;

import java.util.Scanner;

public class main2 {
    public static String rle_encode(String data) {
        if (data == null || data.equals("")) {
            return data;
        }
        char currentChar = data.charAt(0);
        int currentCharCount = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= data.length(); i++) {
            char c = i < data.length() ? data.charAt(i) : 0;
            if (i == data.length() || currentCharCount == 9 || c != currentChar) {
                sb.append(currentChar);
                if (currentCharCount > 1) {
                    sb.append((char) (currentCharCount + '0'));
                }
                currentCharCount = 1;
                currentChar = c;
            } else {
                currentCharCount++;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String inStr = "SSasdfdfhnjhhhhhjjkjkk";
        String outStr = rle_encode(inStr);
        System.out.println(inStr);
        System.out.println(outStr);


    }
}
