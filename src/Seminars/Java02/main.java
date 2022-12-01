package Seminars.Java02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String c1 = "f";
        String c2 = "t";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i += 2) {
            s.append(c1 + c2);
        }
        System.out.println(s);
    }
}
