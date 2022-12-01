package Seminars.Java03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listoflisys {
    public static void create_list(List<ArrayList<String>> Array_of_lists, ArrayList<String> Array) throws Exception {
        boolean flag = false;
        for (int index = 0; index < Array_of_lists.size(); index++) {
            if (Array.get(0).equals(Array_of_lists.get(index).get(0))) {
                for (int i = 1; i < Array.size(); i++) {
                    Array_of_lists.get(index).add(Array.get(i));
                    flag = true;
                }
            }
        }
        if (!flag) {
            Array_of_lists.add(Array);
        }

    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> prosa = new ArrayList<>();
        prosa.add("prosa");
        prosa.add("The war and the peace");
        prosa.add("12 chairs");
        List<ArrayList<String>> ganres_and_books = new ArrayList<>();
        ganres_and_books.add(prosa);

        System.out.println(ganres_and_books);


        Scanner sc = new Scanner(System.in);
        String[] input_data = sc.nextLine().split(", ");
        ArrayList<String> new_data = new ArrayList<>();
        System.out.println(input_data);
        for (String input : input_data) {
            new_data.add(input);
            System.out.println(input);
        }
        System.out.println(new_data.size());
        sc.close();
        create_list(ganres_and_books, new_data);
        System.out.println(ganres_and_books);


    }
}
