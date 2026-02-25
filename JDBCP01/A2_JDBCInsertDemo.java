package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A2_JDBCInsertDemo {
        public static void main(String[] args)  {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // load driver class
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/mystd?useSSL=false&allowPublicKeyRetrieval=true",
                        "root",
                        "Mysql@12"
                );
                Statement statement=con.createStatement();
                //String query="select * from students";
                String query = "INSERT INTO students (id,stdName,age) values(5,'Ankit',21)";

               // ResultSet rs=statement.executeQuery(query);
                int update = statement.executeUpdate(query);
                System.out.println("Inserted"+update+"rows");



            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
}


