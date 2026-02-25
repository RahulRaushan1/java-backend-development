package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A3_JDBC_Update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver class
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "Mysql@12"
            );
            Statement statement=con.createStatement();
            //String query="select * from students";
            String query = "UPDATE students set age = 22 where id=1";

            // ResultSet rs=statement.executeQuery(query);
            int update = statement.executeUpdate(query);
            System.out.println("Updated"+update+"rows");



        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
