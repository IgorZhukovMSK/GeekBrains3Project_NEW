package Lesson6.Task2;

import static Lesson6.Task2.IsOneAndFour.isOneAndFour;
import static Lesson6.Task2.IsOneAndFour.printResult;

/**
 * Написать метод, который проверяет состав массива из чисел 1 и 4.
 * Если в нем нет хоть одной четверки или единицы, то метод вернет false;
 * Написать набор тестов для этого метода (по 3-4 варианта входных данных).
 */

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 0, 0, 4};

        printResult (isOneAndFour(arr));
    }
}

