package Lesson2.Task2;

import Lesson2.Task1.CreatTable;
import Lesson2.Task1.MainBD;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import static Lesson2.Task1.AddRecord.addRecord;
import static Lesson2.Task1.Connect.connect;
import static Lesson2.Task1.Disconnect.disconnect;

/**
 * Обновить данные в БД из файла (файл приложен test.txt)
 */


public class Main extends MainBD {
    protected String nameScore;
    protected String nameСolumnID;
    protected   String dataID;
    protected   String dataScore;

    public static void main(String[] args) {

        try {
            connect();

            new Lesson2.Task2.CreatTable().creatTable("Test4", "ID", "Name", "Score");



        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        disconnect();
    }
}


