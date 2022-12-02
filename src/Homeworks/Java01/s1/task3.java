package Homeworks.Java01.s1;

import java.util.Scanner;

/*
Реализовать простой калькулятор
 */

public class task3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = sc.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = sc.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        op = sc.next().charAt(0);
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Введен некорректный оператор");
                return;
        }
        System.out.println("Результат:");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans + "\n");
    }

}
