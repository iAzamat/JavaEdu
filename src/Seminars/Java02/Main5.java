package Seminars.Java02;

public class Main5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("5");

        String text = "abc";
        text.substring(0, 1);
        text.length();
        // не статик функции вызываются на объекте класса, в котором они написаны
        // не_статик функция может вызывать другую не_статик функцию в этом же классе
        Static.sayHello();
        Character.toLowerCase('5'); // утильное util вспомогательная функция
    }

}
