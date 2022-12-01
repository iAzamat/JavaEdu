package Homeworks.Java01;

import java.util.Scanner;

/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n),
n! (произведение чисел от 1 до n)
 */

public class task1 {

    public static int sumtriag(int n) {
        int result = n * (n + 1) / 2;
        return result;
    }

    public static int my_factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int number = sc.nextInt();
        System.out.printf("Треугольное число: %d\n", sumtriag(number));
        System.out.printf("Факториал: %d! = %d\n", number, my_factorial(number));
    }
}
