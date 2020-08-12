package Lesson2.Task1;

import java.sql.ResultSet;
import java.sql.SQLException;

import static Lesson2.Task1.MainBD.stmt;

public class AddRecord extends MainBD{

    public static void addRecord (String nameTable, String nameColumnValue, String dataValue){

        try {
            ResultSet rs = stmt.executeQuery ("Insert Into " + nameTable + " (" + nameColumnValue + ") " + " Values (" + "'" + dataValue + "'" + ")");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            stmt.executeUpdate(nameTable);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
