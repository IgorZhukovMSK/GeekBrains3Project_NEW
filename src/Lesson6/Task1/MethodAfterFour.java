package Lesson6.Task1;

import java.util.Arrays;

public class MethodAfterFour {

    public static int[] methodAfterFour(int[] arr) throws RuntimeException {
        int n = 0;
        String str = Arrays.toString(arr);
        if (str.indexOf(String.valueOf(4)) != -1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) n = i;
            }
            int[] arr1 = new int[arr.length - n - 1];
            System.arraycopy(arr, n + 1, arr1, 0, arr1.length);

//            for (int i = 0; i < arr1.length; i++) {
//                System.out.print(arr1[i] + " ");
//            }

            return arr1;
        } else {
            throw new RuntimeException("4 не найдена");
        }

    }

}
