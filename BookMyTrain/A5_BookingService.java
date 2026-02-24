package BookMyTrain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A5_BookingService {
    private List<A1_Train> trainList= new ArrayList<>();
    private List<A3_Ticket> ticketList=new ArrayList<>();

    public A5_BookingService (){
        trainList.add(new A1_Train(101,"Rajdhani Express", "Delhi","Nagpur",100));
        trainList.add(new A1_Train(102,"Shatabdi Express", "Delhi","Mumbai",60));
        trainList.add(new A1_Train(103,"Durunto Express", "Delhi","Delhi",70));
        trainList.add(new A1_Train(104,"vande Express", "Delhi","Goa",100));
        trainList.add(new A1_Train(105,"Intercity Express", "Kolkata","Manali",90));
        trainList.add(new A1_Train(106,"Tejas Express", "Delhi","Bengaluru",80));

    }
    public List<A1_Train> searchTrain(String source,String destination){
       List<A1_Train> res=new ArrayList<>();
       for(A1_Train train:trainList){
           if(train.getSource().equalsIgnoreCase(source)&& train.getDestination().equalsIgnoreCase(destination)){
               res.add(train);
           }
       }
       return res;
    }

    public A3_Ticket bookTicket(A2_User user,int trainId,int seatCount){
        for(A1_Train train:trainList){
            if(train.getTrainId()==trainId){
                if(train.bookSeats(seatCount)){
                    A3_Ticket ticket = new A3_Ticket(user,train,seatCount);
                    ticketList.add(ticket);
                    return ticket;
                }
                else {
                    System.out.println( "No enough seats available");
                    return null;
                }
            }
        }
        System.out.println("Train Id not found");
        return null;
    }

    public List<A3_Ticket> getTicketByUser(A2_User user){
        List<A3_Ticket> res = new ArrayList<>();
        for(A3_Ticket ticket:ticketList){
            if(ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                res.add(ticket);
            }
        }
        return res;
    }

    public boolean cancelTicket (int ticketId,A2_User user){
        Iterator<A3_Ticket> iterator = ticketList.listIterator();
        while(iterator.hasNext()){
            A3_Ticket ticket =iterator.next();
            if(ticket.getTicketId()==ticketId && ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                A1_Train train = ticket.getTrain();
                train.cancelSeats(ticket.getSeatBooked());
                iterator.remove();
                System.out.println("Ticket"+ticketId +"cancelled Successfully");
                return true;
            }
        }
        System.out.println("Ticket not found or does not belong to current user");
        return false;
    }
    public void listAllTrains(){
        System.out.println("List of all trains:");
        for(A1_Train train:trainList){
            System.out.println(train);
        }
    }
}

