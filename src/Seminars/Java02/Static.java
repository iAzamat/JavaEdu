package Seminars.Java02;

public class Static {
    // static - функция класса(не нужно никого создавать, чтобы ее вызвать)
    // void - у функции нет return
    public static void sayHello() {
        System.out.println("Hello");
//        sayHelloNoStatic(); нельзя вызывать
    }

    // внутри не статик функции можем вызвать static функцию

    public void sayHelloNoStatic() {
        sayHello();
        System.out.println("Hello");
    }
}
