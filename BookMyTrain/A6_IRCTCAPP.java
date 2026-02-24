package BookMyTrain;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class A6_IRCTCAPP {

    private final Scanner scanner= new Scanner(System.in);
    private final A4_UserService userService = new A4_UserService();
    private final A5_BookingService bookingService=new A5_BookingService();
    public static void main(String[] args) {
       new A6_IRCTCAPP().start();
    }
    public void start(){
        while(true){
            System.out.println("----Welcome to IRCTC APP ----00");
            if(!userService.isLoggedIn()){
                System.out.println("1.Register");
                System.out.println("2.Login");
                System.out.println("3.Exit");
                System.out.print("Enter Choice: ");
                int choice = scanner.nextInt();

                switch(choice){
                    case 1 -> register();
                    case 2 -> login();
                    case 3 -> exitApp();
                    default -> System.out.println("Invalid Choice.");

                }
            }
            else {
                showUserMenu();
            }
        }
    }
    public void register(){
        System.out.print("Enter Username :");
        String username=scanner.next();
        System.out.print("Enter Password :");
        String password=scanner.next();
        System.out.print("Enter Full Name");
        scanner.nextLine();
        String fullName=scanner.nextLine();
        System.out.print("Enter contact");
        String contact = scanner.next();

        userService.registerUser(username,password,fullName,contact);
    }
    public void login(){
        System.out.print("Enter Username :");
        String username=scanner.next();
        System.out.print("Enter Password :");
        String password=scanner.next();
        userService.loginUser(username,password);
    }
    private void showUserMenu(){
        while(userService.isLoggedIn()){
            System.out.println("\n-----User Menu ------");
            System.out.println("1. Search Trains:");
            System.out.println("2. Book Ticket:");
            System.out.println("3. View My Tickets:");
            System.out.println("4. Cancel Tickets:");
            System.out.println("5. View All Trains");
            System.out.println("6. Logout:");
            System.out.println("Enter Choice:");
            int choice= scanner.nextInt();

            switch (choice){
                case 1 -> searchTain();
                case 2 -> bookTicket();
                case 3 -> viewMyTicket();
                case 4 -> cancelTicket();
                case 5 -> bookingService.listAllTrains();
                case 6 -> userService.logOutUser();
                default -> System.out.println("Invalid Choices.");
            }
        }
    }
    private void searchTain(){
        System.out.println("Enter source station");
        String source = scanner.next();
        System.out.println("Enter destination station");
        String destination =scanner.next();

        List<A1_Train> trains=bookingService.searchTrain(source,destination);
        if(trains.isEmpty()){
            System.out.println("No Trains Found between"+source +" and "+destination);
            return;
        }
        System.out.println("Trains Found:");
        for (A1_Train train:trains){
            System.out.println(train);
        }
        System.out.println("Do you want to book ticket ? (yes/no): ");
        String choice =scanner.next();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Enter Train ID to book");
            int trainID= scanner.nextInt();
            System.out.println("Enter number of seats to book :");
            int seats = scanner.nextInt();

            A3_Ticket ticket = bookingService.bookTicket(userService.getCurrentUser(),trainID,seats);
            if(ticket!=null){
                System.out.println("Booking successful");
                System.out.println(ticket);
            }

        }
        else {
            System.out.println("Returning to user menu :");
        }
    }

    private void bookTicket(){
        System.out.println("Enter source station");
        String source = scanner.next();
        System.out.println("Enter destination station");
        String destination =scanner.next();
        List<A1_Train> trains=bookingService.searchTrain(source,destination);
        if(trains.isEmpty()){
            System.out.println("No Trains Available for booking.");
            return;
        }
        System.out.println("Available Trains :");
        for (A1_Train train:trains){
            System.out.println(train);
        }
        System.out.println("Enter Train ID to book");
        int trainID= scanner.nextInt();
        System.out.println("Enter number of seats to book :");
        int seats = scanner.nextInt();

        A3_Ticket ticket = bookingService.bookTicket(userService.getCurrentUser(),trainID,seats);
        if(ticket!=null){
            System.out.println("Booking successful");
            System.out.println(ticket);
        }

    }
    private void viewMyTicket(){
        List<A3_Ticket> ticketByUser = bookingService.getTicketByUser(userService.getCurrentUser());
        if(ticketByUser.isEmpty()){
            System.out.println("No ticket Booked yet");
        }
        else{
            System.out.println("Your Tickets: ");
            for(A3_Ticket ticket:ticketByUser){
                System.out.println(ticket);
            }
        }
    }
    private void cancelTicket(){
        System.out.println("Enter Ticket ID to cancel");
        int ticketID = scanner.nextInt();
        bookingService.cancelTicket(ticketID,userService.getCurrentUser());
    }

    private void exitApp(){
        System.out.println("Thank you for using IRCTC App.");
        System.exit(0);
    }
}
