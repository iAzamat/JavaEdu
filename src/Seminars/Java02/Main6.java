package Seminars.Java02;

public class Main6 {
    public static void main(String[] args) {
//        recursive(1);
        findPath(1, 4, 1, 2, "");
    }

//    public static void recursive(int count){
//        // базовый случай
//        if (count == 10) {
//            return;
//        }
//        System.out.println(count);
//        recursive(count+1);
//    }

    public static void findPath(int src, int target, int addend, int multiplier, String path) {
        if (src > target) return;
        if (src == target) {
            System.out.println(path);
            return;
        }
        findPath(src + addend, target, addend, multiplier, path + " K1");
        findPath(src * multiplier, target, addend, multiplier, path + " K2");
    }

}
