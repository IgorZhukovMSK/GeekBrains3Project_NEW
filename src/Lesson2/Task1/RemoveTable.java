package Lesson2.Task1;

import java.sql.SQLException;

public class RemoveTable extends MainBD{

    public static void removeTable(String nameTable) throws SQLException {

        boolean rs = stmt.execute("Drop table If Exists " + nameTable);

        System.out.println(rs); // почему всегда false ???? Что то пошло не так (При удалении существующей таблицы false и
                                // при удалении несуществующей таблицы false)

//        if (rs == true){
//            System.out.println("Таблица " + nameTable + " удалена");
//        } else
//        System.out.println("Таблица " + nameTable + " не существует") ;
//    }

    }
}
