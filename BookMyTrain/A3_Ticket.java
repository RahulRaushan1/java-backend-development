package BookMyTrain;

public class A3_Ticket {
    private  int ticketId;
    private A2_User user;
    private  A1_Train train;
    private int seatBooked;
    private static int counter=1001;

    public A3_Ticket( A2_User user, A1_Train train, int seatBooked) {
        this.ticketId = counter++;
        this.user = user;
        this.train = train;
        this.seatBooked = seatBooked;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public A2_User getUser() {
        return user;
    }

    public void setUser(A2_User user) {
        this.user = user;
    }

    public A1_Train getTrain() {
        return train;
    }

    public void setTrain(A1_Train train) {
        this.train = train;
    }

    public int getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        A3_Ticket.counter = counter;
    }

    @Override
    public String toString() {
        return " | Ticket ID:"+ train.getName()+" | Route:"+train.getSource()+ "->"+train.getDestination()+
                "| Seats:"+seatBooked +" | Booked By :"+user.getFullName();
   }
}
