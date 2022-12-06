package Homeworks.Java03;


//Дан массив целых чисел (List<Integer>) удалить из него целые числа.
//Посмотрите на метод removeAll
//(можно сохранить все четные значения в другой список
// и передать его в removeAll или используйте итератор


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 6, 2, 2, 2, 2, 5, 6, 7));
        nums.removeIf(cur -> cur % 2 == 0);
        System.out.println(nums);
//        Iterator<Integer> iterator = nums.iterator();
//        while (iterator.hasNext()) {
//            int cur = iterator.next();
//            if (cur % 2 == 0) {
//                iterator.remove();
//            }
//        }

    }
}
