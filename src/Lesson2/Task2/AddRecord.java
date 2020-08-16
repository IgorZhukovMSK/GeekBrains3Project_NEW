package Lesson2.Task2;

import Lesson2.Task1.MainBD;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AddRecord extends Main {



    public static void addRecord (String nameTable, String nameСolumnID, String nameColumnValue, String nameScore,
                                  String dataID, String dataValue, String dataScore){

        try {
            ResultSet rs = stmt.executeQuery ("Insert Into " + nameTable + " " +
                    "(" + nameСolumnID + "," + nameColumnValue + " ," + nameScore+ ") " + " Values " +
                    "(" + "'" + dataID + "'" + "'" + dataValue + "'" + "'" + dataScore + "'" + ")");

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
