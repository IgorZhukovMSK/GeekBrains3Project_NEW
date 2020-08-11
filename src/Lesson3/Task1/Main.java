package Lesson3.Task1;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Прочитать файл (около 50 байт) в байтовый массив и вывести этот массив в консоль;
 */
public class Main {

    public static void main(String[] args) throws IOException {

        byte[] bytes = new byte[50];

        FileInputStream in = new FileInputStream("src/Lesson3/task1.txt");

        int x;

        while ((x = in.read(bytes)) != -1) {

            for (int i = 0; i < x; i++) {

                System.out.print((char) bytes[i]);
            }
        }
        in.close();
    }
}
