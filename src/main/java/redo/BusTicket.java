package redo;

public class BusTicket extends Ticket{
    public BusTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }

    @Override
    public void printPaymentAmount() {
        System.out.println(getPrice());
    }
}
