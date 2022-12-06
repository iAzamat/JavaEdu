package Homeworks.Java03;

//Дан массив целых чисел (List<Integer>)
//        найти минимальное, максимальное значения в этом массиве.

import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(89, 2, 23, 4, 1, 13, 7, 8, 9, 10);
        System.out.println("Заданный массив: " + nums);
        System.out.println("\nРешение через метод:");
        System.out.println("Максимум: " + Collections.max(nums));
        System.out.println("Минимум: " + Collections.min(nums));

        System.out.println("\nРешение через алгоритм:");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(num, max); // if num > max { max = num};
            min = Math.min(num, min);
        }
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}
