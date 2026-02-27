package GarageBillingSystem.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A1_DbConfig {
    private static final String URL="jdbc:mysql://127.0.0.1:3306/garage";
    private static final String USER="root";
    private static final String PASS="Mysql@12";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASS);
    }
}
