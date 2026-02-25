package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A5_ForwardDirOnly {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver class
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "Mysql@12"
            );
            Statement statement=con.createStatement();
            String query="select * from students";

            ResultSet rs=statement.executeQuery(query);
            // TYPE_FORWARD_ONLY, CONCURENT_READ_ONLY -- default
            System.out.println("--- Read data ------");
            while(rs.next()){
                System.out.println(
                        rs.getInt("id")+ " | "+
                                rs.getString("stdname")+" | "+
                                rs.getInt("age")
                );
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
