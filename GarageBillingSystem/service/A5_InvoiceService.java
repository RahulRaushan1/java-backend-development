package GarageBillingSystem.service;
import GarageBillingSystem.Config.A1_DbConfig;
import GarageBillingSystem.entity.A2_Customer;
import GarageBillingSystem.entity.A3_Invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class A5_InvoiceService {
    public void addInvoice(A3_Invoice invoice) throws SQLException{
        Connection conn = A1_DbConfig.getConnection();
        PreparedStatement ps =
                conn.prepareStatement("INSERT INTO invoices (customer_id,vehicle_id,service_id) VALUES (?,?,?)");
        ps.setInt(1,invoice.getCustomerId());
        ps.setInt(2,invoice.getVehicleId());
        ps.setInt(3,invoice.getServiceId());

        ps.executeUpdate();
        ps.close();
        conn.close();


    }
    public List<A3_Invoice> getAllInvoices() throws SQLException{
        List<A3_Invoice> list = new ArrayList<>();
        Connection conn = A1_DbConfig.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * from invoices");
        while (rs.next()){
            list.add(new A3_Invoice(rs.getInt("id"),
                    rs.getInt("customer_id"),
                    rs.getInt("vehicle_id"),
                    rs.getInt("service_id")));
        }
        return list;
    }
}
