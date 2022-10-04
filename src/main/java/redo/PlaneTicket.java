package redo;

public class PlaneTicket extends Ticket{
    protected boolean isFrequentFlyer;

    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price, boolean isFrequentFlyer) {
        super(id, origin, destination, seatNumber, price);
        this.isFrequentFlyer = isFrequentFlyer;
    }

    @Override
    public void printPaymentAmount() {
        System.out.println(getPrice());
    }
}
