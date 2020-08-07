package Lesson2.Task2;

import Lesson2.Task1.MainBD;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CreatTable extends Main {


    public void creatTable (String nameTable, String nameСolumnID, String nameColumnValue, String nameScore) throws SQLException {

        ResultSet rs = stmt.executeQuery("CREATE TABLE " + nameTable + " (" + nameСolumnID +
                " TEXT," +
                " " + nameColumnValue + " TEXT," +
                " " + nameScore + " TEXT )");

        stmt.executeUpdate(nameTable);

        System.out.println("Создана таблица " + nameTable);
    }
}
