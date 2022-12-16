package Homeworks.Java06;

/*
Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
1) ФИО,

2) номер читательского билета,

3) факультет,

4) дата рождения,

5) телефон.

6) Методы (экземпляра, без слова static) takeBook(), returnBook().

7) Разработать программу, в которой создается массив объектов данного класса.

8) Перегрузить методы takeBook(), returnBook():

 * takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".

 * takeBook, который будет принимать переменное количество названий книг.
Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

 * takeBook, который будет принимать переменное количество (Тип... parameterName)
объектов класса Book (создать новый класс, содержащий имя и автора книги).
Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

9) Аналогичным образом перегрузить метод returnBook().
Выводит на консоль сообщение "Петров В. В.
вернул книги: Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".
 */

import java.util.Arrays;

public class Reader {
    private String fullName;
    private String number;
    private String facult;
    private String date;
    private String phone;

    public Reader(String fullName, String number, String facult, String date, String phone) {
        this.fullName = fullName;
        this.number = number;
        this.facult = facult;
        this.date = date;
        this.phone = phone;
    }

    public Reader() {

    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNumber() {
        return number;
    }

    public String getFacult() {
        return facult;
    }

    public String getDate() {
        return date;
    }

    public String getPhone() {
        return phone;
    }

    public void takeBook(String book) {
        System.out.println("Студент " + fullName + " взял книгу " + book);
        System.out.println();
    }

    public void takeBook(String... books) {
        System.out.println(fullName + " взял книги: " + Arrays.toString(books));
        System.out.println();
    }

    public void takeBook(int bookCount) {
        System.out.println(fullName + " взял " + bookCount + " книги");
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fullName + " взял книги: " + Arrays.toString(books));
        System.out.println();
    }

    public void returnBook(String book) {
        System.out.println("Студент " + fullName + " вернул книгу " + book);
        System.out.println();
    }

    public void returnBook(String... books) {
        System.out.println(fullName + " вернул книги: " + Arrays.toString(books));
        System.out.println();
    }

    public void returnBook(int bookCount) {
        System.out.println(fullName + " вернул " + bookCount + " книги");
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fullName + " вернул книги: " + Arrays.toString(books));
        System.out.println();
    }

    @Override
    public String toString() {
        return "Reader{" +
                "ФИО: " + fullName + ", " +
                "номер билета: " + number + ", " +
                "факультет: " + facult + ", " +
                "дата рождения: " + date + ", " +
                "телефон: " + phone +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;

        if (number != reader.number) return false;
        if (fullName != null ? !fullName.equals(reader.fullName) : reader.fullName != null) return false;
        if (date != null ? !date.equals(reader.date) : reader.date != null) return false;
        if (phone != null ? !phone.equals(reader.phone) : reader.phone != null) return false;
        return facult != null ? facult.equals(reader.facult) : reader.facult == null;
    }
}
