package Lesson6.Task2;

public class IsOneAndFour {

    public static boolean isOneAndFour(int[] arr) {
        boolean i1 = false;
        boolean i4 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                i1 = true;

            else if (arr[i] == 4)
                i4 = true;

        }
        return  i1 && i4;
    }

    public static void printResult (Boolean isOneAndFour){
        System.out.println(isOneAndFour);
    }

}
