package Lesson2.Task1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadDataValue extends MainBD{

    public static void readDataValue(String nameTable, String nameColumnValue, String dataValue) throws SQLException {

        ResultSet rs = stmt.executeQuery("Select " + nameColumnValue + " FROM " + nameTable
                + " Where " + nameColumnValue + "=" + "'" + dataValue + "'");

        stmt.executeUpdate(nameTable);

        if  (rs.next()) {

            System.out.println("Искомая запись " +  rs.getString("name") + " найдена");

        } else
        System.out.println("Не найдено");
    }
}
