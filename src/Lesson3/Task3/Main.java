package Lesson3.Task3;

import java.io.*;

/**
 * Написать консольное приложение, которое умеет постранично читать текстовые файлы (размером > 10 mb).
 * Вводим страницу (за страницу можно принять 1800 символов),
 * программа выводит ее в консоль.
 * Контролируем время выполнения:    // контроль написан
 * программа не должна загружаться дольше 10 секунд,
 * а чтение – занимать свыше 5 секунд.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader brR = new BufferedReader(new InputStreamReader(System.in));

        long timeStartR = System.currentTimeMillis(); // время записи

        BufferedWriter bwR = new BufferedWriter(new FileWriter("src/Lesson3/task3.txt"));

        String text;
        while (!(text = brR.readLine()).equals("ESC")) {

            bwR.write(text + "\n");
            bwR.flush();

            bwR.close();

            System.out.println("Время записи составляет: " + ((System.currentTimeMillis() - timeStartR) * 0.0001));

            long timeStartW = System.currentTimeMillis(); // чтение

            BufferedReader brW = new BufferedReader(new FileReader("src/Lesson3/task3.txt"));

            String s;
            while ((s = brW.readLine()) != null) {

                System.out.println(s);

                System.out.println("Время чтения из файла составляет: " + ((System.currentTimeMillis() - timeStartW) * 0.0001));

            }
        }
    }
}
