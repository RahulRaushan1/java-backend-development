package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A7_ScrollInsensitiveDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver class
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "Mysql@12"
            );
            Statement statement=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String query="select * from students";

            ResultSet rs=statement.executeQuery(query);

            System.out.println("fetch data not live update mode----------");
            Thread.sleep(10000);
            rs.beforeFirst();
            while(rs.next()){
                System.out.println(
                        rs.getInt("id")+ " | "+
                                rs.getString("stdname")+" | "+
                                rs.getInt("age")
                );
            }

            con.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
