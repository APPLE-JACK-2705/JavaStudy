package lesson_06.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionService {

    private static Connection connection;

    private ConnectionService(){

    }

    public static Connection getConnection(){
        if (connection == null){
            try{
                connection = DriverManager
                        .getConnection("jdbc:sqlserver://localhost:1433", "putin", "rekrut1337");
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void disconnect(){
        try{
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

