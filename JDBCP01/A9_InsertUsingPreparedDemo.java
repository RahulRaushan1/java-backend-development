package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class A9_InsertUsingPreparedDemo {
    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver class
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "Mysql@12"
            );

            String query = "INSERT INTO students (id,stdName,age) values(?,?,?)";

            PreparedStatement pstmt =con.prepareStatement(query);

            /*Scanner sc = new Scanner(System.in);
            System.out.println("enter id for student :");
            int id1 = sc.nextInt();*/

            pstmt.setInt(1,104);
            pstmt.setString(2,"Ankit");
            pstmt.setInt(3,13);
            pstmt.executeUpdate();

            pstmt.setInt(1,106);
            pstmt.setString(2,"Raj");
            pstmt.setInt(3,49);
            pstmt.executeUpdate();

            System.out.println("multiple row inserted");
            con.close();






        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
