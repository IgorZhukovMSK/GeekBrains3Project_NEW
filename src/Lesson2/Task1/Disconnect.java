package Lesson2.Task1;

import java.sql.SQLException;

public class Disconnect extends MainBD {

    public static void disconnect() {

        try {
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
