package Lections.Java01;

import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
//import java.io.*;

/**
 * program
 */
// однострочный коментарий

public class program {

    // Data types
    public static void datatypes() {
        short age = 10;
        int salary = 123456;
        System.out.println(age); // 10
        System.out.println(salary); // 123456

        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415

        float f = 123.45f;
        double f2 = 123.45D;


        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

        int a = 13;
        double d = a;

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false

        // =================================================
        boolean f3 = true && false;
        boolean f4 = true || false;
        System.out.println(f3);
        System.out.println(f4);
    }

    public static void datatypes2() {
        String msg = "Hello world";

        System.out.println(msg); // Hello world

        var i = 123;

    }

    public static void datatypes3() {
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); //1022
        // d = "mistake";
        // error incompatible types:
        // String cannot be converted to double
    }

    public static void datatypes4() {
//        int i = 23_123_34;
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        String s = "qwer";
//        System.out.println(s.charAt(1));
//        int a = 123;
//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a);

//        int b = 18;
//        // 10010
//        // a = a << 1;
//        System.out.println(b << 1);
//        // 1001
//        int a1 = 5;
//        int b1 = 2;
//        System.out.println(a1 | b1);
        // 101
        // 010
        // 111
//        System.out.println(a1 & b1);
        // 101
        // 010
        // 000
//        System.out.println(a1 ^ b1);
        // 101
        // 010
        // 111

//        boolean a3 = true;
//        boolean b3 = true;
//
//        System.out.println(a3&b3);
//        System.out.println(a3&&b3);

        String s = "qwwe1"; // 4, 0..3
//        boolean b = s.length() >= 5 && s.charAt(4) == '1';
//        boolean b = s.length() >= 5 & s.charAt(4) == '1';
//        boolean b = s.length() >= 5 || s.charAt(4) == '1';
        boolean b = s.length() >= 5 | s.charAt(4) == '1';

        System.out.println(b);
    }

    public static void arrays() {
//        int[] arr = new int[10];
//        System.out.println(arr.length); // 10
//        System.out.println(arr[3]);
//
//        arr = new int[]{1, 2, 3, 4, 5};
//        System.out.println(arr.length); // 5
//        arr[3] = 13;

//        int[] arr;
//        int brr[];
        // Многомерные
//        int[] arr[] = new int[3][5];
//        for (int[] line: arr){
//            for(int item: line){
//                System.out.printf("%d ", item);
//            }
//            System.out.println();
//        }
        int[][] arr = new int[3][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

    }

    public static void convertors() {
//        int i =123; double d=i;
//        System.out.println(i); // 123
//        System.out.println(d); // 123.0
//        d = 3.1415; i = (int)d;
//        System.out.println(d); // 3.1415
//        System.out.println(i); // 3
//        d = 3.9415; i=(int) d;
//        System.out.println(d); // 3.9415
//        System.out.println(i); // 3
//        byte b = Byte.parseByte("123");
//        System.out.println(b);
//        b = Byte.parseByte("1234");
//        System.out.println(b); // NumberFormatException: Value out of range

//        int [] a = new int [10];
//        double [] d = a; // ИЗУЧАЕМ ковариантность и контравариантность
    }

    public static void inputs() {
        Scanner sc = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = sc.nextLine();
//        System.out.printf("Привет, %s", name);

//        System.out.printf("int a: ");
//        int x = sc.nextInt();
//        System.out.printf("double a: ");
//        double y = sc.nextDouble();
//        System.out.printf("%d + %f = %f", x, y, x + y);

//        System.out.printf("int a: ");
//        boolean flag = sc.hasNextInt();
//        System.out.println(flag);
//        int i = sc.nextInt();
//        System.out.println(i);

//        String s = "qwe";
//        int a = 123;
//        String q = s + a;
//        System.out.println(q);
//        // 4 строки

        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);

        sc.close();
    }

    public static void typesspecifikators() {
        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00
    }

    static int t = 123;

    public static void visionplace() {
//        int a = 132;
        int b = 111;
        {
            int a = 222;
            System.out.println(a + b);
        }
        int a = 123;
        System.out.println(a);
    }


    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1) return 1;
        return n * factor(n - 1);
    }

    public static void functions() {
        lib.sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); //120.0
    }

    public static void ifelseconstruct() {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);

        int min = a < b ? a : b;
        System.out.println(min);

        int mounth = 123;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
    }

    public static void cicls() {
//        int value = 321;
//        int count = 0;
//
//        while (value != 0) {
//            value /= 10;
//            count++;
//        }
//        System.out.println(count);
//
//        do {
//            value /= 10;
//            count++;
//        } while (value != 0);
//        System.out.println(count);


//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i % 2 != 0) {
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//                break;
//            }
//            break;
//        }

//        int arr[] = new int[10];
//        for (int item:arr){
//            System.out.printf("%d ", item);
//        }
//        System.out.println();

        int[] arr = new int[]{1, 2, 3, 4, 5, 77};
        for (int item : arr) {
            System.out.println(item);
        }

    }

    public static void files() throws Exception {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // =======================================

        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }


    public static void main(String[] args) throws Exception {
//        System.out.println("Hello World");
//        datatypes();
//        datatypes2();
//        datatypes3();
//        datatypes4();
//        arrays();
//        convertors();
//        inputs();
//        typesspecifikators();
//        visionplace();
//        functions();
//        ifelseconstruct();
//        cicls();
        files();
    }
}