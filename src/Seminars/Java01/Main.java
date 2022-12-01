package Seminars.Java01;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Задание 1
//        System.out.println(LocalDateTime.now().getHour());
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите имя: ");
//        String name = sc.nextLine();
//
//        int b = LocalDateTime.now().getHour();
//        String text = "";
//        if (b >= 5 && b < 12) text = "Доброе утро";
//        else if (b >= 12 && b < 18) text = "Добрый день";
//        else if (b >= 18 && b < 23) text = "Добрый вечер";
//        else text = "Доброй ночи";
//        System.out.printf("%s, %s\n", text, name);
//        sc.close();


//        // Задание 2
//        int[] arr = new int[]{1, 0, 1, 0, 1, 1};
////        System.out.printf("%d %d %d %d %d %d", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
//        int count = 0;
//        int max_count = 0;
//        int elem = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == elem) {
//                count++;
//                if (count > max_count) {
//                    max_count = count;
//                }
//            } else {
//                count = 0;
//            }
//
//        }
//        System.out.println(max_count);

//        // Задание 3
//        int[] nums = new int[]{3, 2, 2, 3, 1, 1};
//        int last_pos = nums.length - 1;
//        int digit = 3;
//        int tmp_str;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (i >= last_pos) {
//                break;
//            }
//            if (digit == nums[i]) {
//                while (nums[last_pos] == digit) {
//                    last_pos--;
//                }
//                tmp_str = nums[last_pos];
//                nums[last_pos] = nums[i];
//                nums[i] = tmp_str;
//            }
//            else
//            {
//            }
//        }
//        System.out.println(Arrays.toString(nums));

//        // Задание 4
//        String words[] = {"Башкир", "Азбука", "Азимут", "Башкортастан", "Башмут"};
//        ArrayList<String> prefixes = new ArrayList<>();
//        StringBuilder pref = new StringBuilder();
//        for (int i = 0; i < words.length; i++) {
//            var wordChar = words[i].toCharArray();
//            for (int j = i + 1; j < words.length; j++) {
//                var wordChar2 = words[j].toCharArray();
//                for (int k = 0; k < wordChar.length; k++) {
//                    if (wordChar2.length <= k) {
//                        break;
//                    }
//                    if (wordChar[k] == wordChar2[k]) {
//                        pref.append(wordChar[k]);
//                    } else {
//                        break;
//                    }
//                }
//                //
//                if (pref.length() > 0) {
//                    prefixes.add(pref.toString());
//                    pref = new StringBuilder();
//                }
//            }
//        }
//
//        String max = "";
//        System.out.println(prefixes);
//        for (String p : prefixes) {
//            if (p.length() > max.length()) {
//                max = p;
//            }
//        }
//        System.out.println(max);

        // Задание 4(2)

//        String[] str = {"hello", "hettti", "hell"};
//        for (int i = 0; i < 4; i++) {
//            for (int j = 1; j < str.length; j++) {
//                if (str[0].substring(0, i) != str[j].substring(0, i))
//                    System.out.println(str[0].substring(0, i - 1));
//                    break;
//
//            }
//        }

    }
}
