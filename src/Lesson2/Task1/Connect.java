package Lesson2.Task1;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect extends MainBD {

    public static void connect() throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:Lesson2_Task1_BD.db");
        stmt = connection.createStatement();

    }
}
