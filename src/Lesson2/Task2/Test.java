package Lesson2.Task2;



import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader (new FileReader("G://Qnap//Java учеба//Geekbrains//GeekBrains_3_материалы//Урок 2. Базы данных//test.txt"));

                    //нужно по словам с разбивкой записать в массив, и потом попробовать из массива перенсти в строку
        String str;

        ArrayList <String> arrStr = new ArrayList<>();

        String [] [] arr = new String[3][];

        String[] s = reader.readLine().split("  ");

        while(( str = reader.readLine())!=null){

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {


                }

            }

            arrStr.add(Arrays.toString(s));
        }

        System.out.println(arrStr);



//            String str;
//
//            ArrayList<String> list = new ArrayList<>();
//
//            String[] s = reader.readLine().split("  ");
//
//            System.out.println(s.length);
//
//            for (int i = 0; i < s.length ; i++) {
//
//              list.add(s[i]);
//
//               // System.out.println(list.get(i));
//
//            }


           //     System.out.println(list.toString());




            //String[] s = reader.nextLine().split(" ");

        }


    }

