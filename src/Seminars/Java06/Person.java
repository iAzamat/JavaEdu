package Seminars.Java06;

public class Person {
    // поля
    String name;
    int age;

    // конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    // функции экземпляра
    @Override
    public String toString() {
        return "Person{ " +
                "name: " + name + ", " +
                "age: " + age +
                " }";
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Person ivan = new Person();
        ivan.name = "Иван";
        ivan.age = 23;

        System.out.println(ivan);
        System.out.println(Integer.toHexString(ivan.hashCode()));

        Person some = new Person("Some", 5);
        System.out.println(some);
        some.setName("newSomeName");
        System.out.println(some);
    }
}
