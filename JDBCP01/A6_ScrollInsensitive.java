package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A6_ScrollInsensitive {
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

            System.out.println("------------Scroll insensitive, read only---------");

            rs.last();
            System.out.println("Last Row : "+rs.getInt("id"));
            System.out.println("Last Row : "+rs.getString("stdName"));

            rs.first();
            System.out.println("Last Row: "+rs.getInt("id"));
            System.out.println("Last Row: "+rs.getString("stdName"));

            rs.absolute(2);
            System.out.println("Second Row: "+rs.getInt("id"));
            System.out.println("Second Row: "+rs.getString("stdName"));


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
