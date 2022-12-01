package Seminars.Java02;

/*

Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
который запишет эту строку в простой текстовый файл, обработайте исключения.

 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main3 {
    public static void main(String[] args) throws Exception {
        String st = "TEST".repeat(100);
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write(st);
//            fw.append(st);
            fw.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }

}
