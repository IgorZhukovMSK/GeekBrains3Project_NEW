package Lesson2.Task1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteDataValue extends MainBD {

    public static void deleteDataValue(String nameTable, String nameColumnValue, String dataValue) {

        try {
            ResultSet rs = stmt.executeQuery("Delete FROM " + nameTable
                    + " Where " + nameColumnValue + "=" + "'" + dataValue + "'");


        } catch (SQLException throwables) {

            throwables.printStackTrace();
        }


    }
}
