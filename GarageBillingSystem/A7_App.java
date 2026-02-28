package GarageBillingSystem;

import GarageBillingSystem.entity.A2_Customer;
import GarageBillingSystem.service.A6_BillingService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A7_App {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        A6_BillingService service = new A6_BillingService();

        while(true){
            System.out.println("1. Add Customer with Vehicle\n2. Generate Invoice \n3. Show Invoice \n4. Exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Customer name: ");
                    String name = sc.next();
                    System.out.print("phone:");
                    String phone= sc.next();
                    service.customerService.addCustomer(new A2_Customer(0,name,phone));
                    System.out.println("Enter vehicle number: ");
                    String Vehiclenum=sc.next();
                    System.out.println("Enter Vehicle model");
                    String model=sc.next();
                    A2_Customer customersBasedOnNum= service.customerService.getCustomersBasedOnNum(phone);
                    break;

                case 2:
                    System.out.print("Enter customer ID: ");
                    int cid = sc.nextInt();
                    System.out.print("Enter vehicle Id: ");
                    int vid = sc.nextInt();
                    System.out.print("Enter number of services: ");
                    int n = sc.nextInt();
                    List<Integer> sids= new ArrayList<>();
                    for(int i=0;i<n;i++){
                        System.out.println("enter the service id:");
                        sids.add(sc.nextInt());
                    }
                    service.createInvoice(cid,vid,sids);
                    break;
                case 3:
                    service.showAllInvoices();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Not a valid choice");
                    break;

            }
        }
    }
}
