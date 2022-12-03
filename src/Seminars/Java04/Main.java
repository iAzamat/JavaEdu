package Seminars.Java04;


public class Main {
    static int area = 5;
    public static void main(String[] args) {
        System.out.println("area in main: " + area);
        dfs();
        System.out.println("area after func: " + area);
    }

    static void dfs() {
        area++;
        System.out.println("area in func increment");
        System.out.println("area: " + area);
    }
}
