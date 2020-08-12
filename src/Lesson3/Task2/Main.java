package Lesson3.Task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Последовательно сшить 5 файлов в один (файлы примерно 100 байт).
 * Может пригодиться следующая конструкция: ArrayList<InputStream> al = new ArrayList<>(); ... Enumeration<InputStream> e = Collections.enumeration(al);
 */

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<InputStream> arrayList = new ArrayList<>();

        arrayList.add(new FileInputStream("src/Lesson3/task2 - 1.txt"));
        arrayList.add(new FileInputStream("src/Lesson3/task2 - 2.txt"));
        arrayList.add(new FileInputStream("src/Lesson3/task2 - 3.txt"));
        arrayList.add(new FileInputStream("src/Lesson3/task2 - 4.txt"));
        arrayList.add(new FileInputStream("src/Lesson3/task2 - 5.txt"));

        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(arrayList));

        int x;

        while ((x = in.read()) != -1) {
            System.out.print((char) x);
        }

        in.close();
    }
}
