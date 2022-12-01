package Seminars.Java03;

import java.util.*;

public class main2 {

    public static void main(String[] args) throws Exception {
//        Task1();
//        Task2();
//        Task3();
    }

    public static void Task1() {
        ArrayList<Integer> arrlist = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            arrlist.add(new Random().nextInt(100));
        }
        System.out.println(arrlist);
        Collections.sort(arrlist);
        System.out.println(arrlist);

    }

    public static void Task2() {
        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Нептун");
        planets.add("Уран");
        planets.add("Сатурн");
        planets.add("Плутон");
        ArrayList<String> new_planets = new ArrayList<>();
        for (int index = 0; index < 20; index++) {
            new_planets.add(planets.get(new Random().nextInt(0, 9)));
        }
        System.out.println(new_planets);

        int count = 0;

        for (int i = 0; i < planets.size(); i++) {
            for (int j = 0; j < new_planets.size(); j++) {
                if (planets.get(i).equals(new_planets.get(j))) {
                    count += 1;
                }
                if (count > 1) {
                    new_planets.remove(j);
                }
            }
            System.out.println(new_planets);
//            System.out.println(planets.get(i) + " встречается: " + count + " раз(а)");
            count = 0;
        }

    }

    public static void Task3() {
        ArrayList<String> new_List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            new_List.add(sc.next());
        }
        System.out.println(new_List);

        for (int i = 0; i < new_List.size(); i++) {
            try {
                Integer.parseInt(new_List.get(i));
                new_List.remove(i);
            } catch (Exception e) {
            }
        }
        System.out.println(new_List);

//        final ArrayList<Object> list = new ArrayList<>();
//
//        list.add("man");
//        list.add(5);
//        Object c = list.get(1);
//        System.out.println(c instanceof Integer);
    }
}
