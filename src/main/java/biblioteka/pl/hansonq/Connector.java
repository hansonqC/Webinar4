package biblioteka.pl.hansonq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by lukasz on 2017-09-08.
 */
public class Connector {
    private static  final String SQL_LINK = "jdbc:mysql://5.135.218.27:3306/hansonq";
    private static  final String SQL_USER = "hansonq";
    private static  final String SQL_PASS = "Komornik12";
    private static  final String SQL_CLASS = "com.mysql.jdbc.Driver";

    private static Connector connector = new Connector();

    public static Connector getInstance(){
        return connector;
    }
    private Connection connection;

    public Connection getConnection(){
        return connection;
    }
    private  Connector() {
      connect();
    }


    private void connect(){
        try {
            Class.forName(SQL_CLASS);
            connection= DriverManager.getConnection(SQL_LINK,SQL_USER,SQL_PASS);
            System.out.println("Po³aczono");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
