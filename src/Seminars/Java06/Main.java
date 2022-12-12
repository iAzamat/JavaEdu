package Seminars.Java06;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Здесь неизменяемая коллекция
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10);
        // методы Collection.of() - возвращает неизменяемую коллекцию
        // изменяемая
        map = new HashMap<>(map);
        map.put('C', 100);
    }
}
