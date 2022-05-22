package lesson_06;

import lesson_06.db.ConnectionService;
import java.sql.Connection;

public class Main {
     public static void main(String[] args) {
          Connection connection = ConnectionService.getConnection();
          System.out.println(connection);

          ConnectionService.disconnect();
     }
}

