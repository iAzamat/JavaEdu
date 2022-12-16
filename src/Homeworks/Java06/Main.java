package Homeworks.Java06;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java: Полное руководство", "Герберт Шилдт");
        Book book2 = new Book("Думай как математик", "Барбара Окли");
        Book book3 = new Book("Экономическая теория", "Куликов");
        Book book4 = new Book("Oracle PL/SQL", "Нанда");
        Book book5 = new Book("MySQL. Библиотека профессионала", "Аткинсон");

        Reader reader1 = new Reader(
                "Петров А. И.",
                "QW0001",
                "Экономический",
                "21.12.2001",
                "8984561245");
        Reader reader2 = new Reader(
                "Иванов Н. А.",
                "QW0002",
                "Экономический",
                "12.01.2001",
                "8854785124");
        Reader reader3 = new Reader(
                "Сидорова А. И.",
                "QW0003",
                "Экономический",
                "15.07.1999",
                "8984561236");
        Reader reader4 = new Reader(
                "Иванова О. П.",
                "SQ0001",
                "Физико-математический",
                "30.09.1999",
                "8965321245");
        Reader reader5 = new Reader(
                "Козлова В. З.",
                "SQ0002",
                "Физико-математический",
                "12.09.2001",
                "8236548978");
        Reader reader6 = new Reader(
                "Трофимов Д. А.",
                "SQ0003",
                "Физико-математический",
                "11.11.2000",
                "8945698521");

        Reader[] Readers = new Reader[]{reader1, reader2, reader3, reader4, reader5, reader6};

        System.out.println(reader1);
        System.out.println(reader2);
        System.out.println(reader3);
        System.out.println(reader4);
        System.out.println(reader5);
        System.out.println(reader6);

        reader5.takeBook(15);
        reader6.returnBook(10);

        reader3.returnBook(book1, book3);
        reader2.takeBook(book5, book4);

        reader2.takeBook("Oracle PL/SQL Нанда", "Экономическая теория Куликов");
        reader2.returnBook("Oracle PL/SQL Нанда", "Экономическая теория Куликов");

        reader1.takeBook(book1, book2);
        reader2.takeBook(book3.getNameBook(), book4.getNameBook());

        reader3.returnBook(book4, book5);
        reader4.returnBook(book3.getNameBook(), book2.getNameBook());
    }
}
