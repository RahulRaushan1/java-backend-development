package GarageBillingSystem.service;

import GarageBillingSystem.entity.A3_Invoice;

import java.sql.SQLException;
import java.util.List;

public class A6_BillingService {
    public A4_CustomerService customerService = new A4_CustomerService();
    public A5_InvoiceService invoiceService= new A5_InvoiceService();

    public void createInvoice(int customerId, int vehicleId, List<Integer> serviceIds) throws SQLException {
        String sids="";
        for(int serviceId:serviceIds){
            sids+=serviceId;
        }
        invoiceService.addInvoice(new A3_Invoice(0,customerId,vehicleId,Integer.parseInt(sids)));
        System.out.println("Invoice generated successfully....");
    }

    public void showAllInvoices() throws SQLException {
        List<A3_Invoice> invoices= invoiceService.getAllInvoices();
        for(A3_Invoice invoice:invoices){
            System.out.println(invoice);
        }
    }
}
