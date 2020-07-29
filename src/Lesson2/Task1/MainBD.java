package Lesson2.Task1;

import java.sql.*;

import static Lesson2.Task1.AddRecord.addRecord;
import static Lesson2.Task1.Connect.connect;
import static Lesson2.Task1.DeleteDataValue.deleteDataValue;
import static Lesson2.Task1.Disconnect.disconnect;
import static Lesson2.Task1.ReadDataValue.readDataValue;
import static Lesson2.Task1.RemoveTable.removeTable;


public class MainBD {

    protected static Connection connection;
    protected static Statement stmt;
    protected static PreparedStatement pstmt;
    protected String nameTable;
    protected String nameСolumnID;
    protected String nameColumnValue;
    protected String dataValue;
    protected Integer dataID;


    public static void main(String[] args) {
        try {
            connect();

            new CreatTable().creatTable("Test3", "ID", "Name");
            addRecord ("Test2", "Name", "Vasya1");
            readDataValue("Test2", "Name", "Vasya2");
            deleteDataValue("Test2", "Name", "Vasya1");
            removeTable("Test3");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        disconnect();
    }


}


