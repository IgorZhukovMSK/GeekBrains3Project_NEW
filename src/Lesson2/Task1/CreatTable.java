package Lesson2.Task1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CreatTable extends MainBD {

    public void creatTable (String nameTable, String nameСolumnID, String nameColumnValue) throws SQLException {

        ResultSet rs = stmt.executeQuery("CREATE TABLE " + nameTable + " (" + nameСolumnID +
                " INTEGER PRIMARY KEY AUTOINCREMENT," +
                " " + nameColumnValue + " TEXT)");

        stmt.executeUpdate(nameTable);

        System.out.println("Создана таблица " + nameTable);
    }
}
