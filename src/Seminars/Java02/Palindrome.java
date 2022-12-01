package Seminars.Java02;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        String stringFirst = "A man, a plan, a canal: Panama";
        String stringSecond = "Я иду с мечем  судия";
        String stringSecond2 = "потопf";
//        System.out.println(isPalindrome(stringFirst));
        System.out.println(isPalindromev2(stringSecond2));
    }

    public static boolean isPalindrome(String str) {
        //str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        char leftSymbol = 0;
        char rightSymbol = 0;
        boolean validleft = false;
        boolean validright = false;

        while (left < right) {
            leftSymbol = str.charAt(left);
            rightSymbol = str.charAt(right);

            if (!Character.isLetterOrDigit(rightSymbol)) {
                right--;
            } else {
                validright = true;
            }
            if (!Character.isLetterOrDigit(leftSymbol)) {
                left++;
            } else {
                validleft = true;
            }
            if (validleft && validright) {
                if (leftSymbol == rightSymbol) {
//                    System.out.println(leftSymbol);
                    right--;
                    left++;
                    validleft = false;
                    validright = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPalindromev2(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);

    }
}