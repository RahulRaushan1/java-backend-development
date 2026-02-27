package GarageBillingSystem.service;
import GarageBillingSystem.Config.A1_DbConfig;
import GarageBillingSystem.entity.A2_Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class A4_CustomerService {
    public void addCustomer(A2_Customer customer) throws SQLException{
        Connection conn = A1_DbConfig.getConnection();
        PreparedStatement ps =
                conn.prepareStatement("INSERT INTO customers (name,phone) VALUE (?,?)");
        ps.setString(1,customer.getName());
        ps.setString(2,customer.getPhone());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
    public List <A2_Customer> getAllCustomers() throws SQLException {
        List<A2_Customer> list = new ArrayList<>();
        Connection conn = A1_DbConfig.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * from customers");
        while (rs.next()){
            list.add(new A2_Customer(rs.getInt("id"),rs.getString("name"),rs.getString("phone")));
        }
        return list;
    }

}
