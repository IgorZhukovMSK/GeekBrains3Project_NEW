package Lesson7_Add_Task;

public class Main {

    public static void main(String[] args) {

        int countStrAndCol = 4;

        int num = 1;

        int[][] array = new int[countStrAndCol][countStrAndCol];

        for (int i = 0; i < countStrAndCol; i++) {
            array[0][i] = num;
            num++;
        }
        for (int i = 1; i < countStrAndCol; i++) {
            array[i][countStrAndCol - 1] = num;
            num++;
        }
        for (int i = countStrAndCol - 2; i >= 0; i--) {
            array[countStrAndCol - 1][i] = num;
            num++;
        }
        for (int i = countStrAndCol - 2; i > 0; i--) {
            array[i][0] = num;
            num++;
        }


        // решение из инета, сам не догадался ((((

        int c = 1;
        int d = 1;

        while (num < countStrAndCol * countStrAndCol) {

            while (array[c][d + 1] == 0) {
                array[c][d] = num;
                num++;
                d++;
            }

            while (array[c + 1][d] == 0) {
                array[c][d] = num;
                num++;
                c++;
            }

            while (array[c][d - 1] == 0) {
                array[c][d] = num;
                num++;
                d--;
            }

            while (array[c - 1][d] == 0) {
                array[c][d] = num;
                num++;
                c--;
            }
        }

        for (int x = 0; x < countStrAndCol; x++) {
            for (int y = 0; y < countStrAndCol; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = num;
                }
            }
        }

        for (int x = 0; x < countStrAndCol; x++) {
            for (int y = 0; y < countStrAndCol; y++) {
                if (array[x][y] < 10) {

                    System.out.print(array[x][y] + ",  ");
                } else {
                    System.out.print(array[x][y] + ", ");
                }
            }
            System.out.println("");
        }
    }
}
