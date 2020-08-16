package Lesson8;

import java.util.ArrayList;

public class CountTheNumberOfDigits extends Main {

    public CountTheNumberOfDigits(String str) {
        super();
    }

    public static ArrayList<Integer> CountTheNumberOfDigits(String str) {

        String strArr[] = str.split(" ");

        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        int a1 = 0;

        for (int j = 1; j <= 20; j++) {

            for (int i = 0; i < intArr.length; i++) {

                if (intArr[i] == j) {
                    a1++;
                }
            }
            if (a1 > 0) {
                arrayList.add(a1);
                a1 = 0;
            }
        }
        return arrayList;
    }
}
    

