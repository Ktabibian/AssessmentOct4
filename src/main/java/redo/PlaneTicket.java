package redo;

public class PlaneTicket extends Ticket{
    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }


    protected boolean isFrequentFlyer(){
        return true;
    }

    @Override
    public void printPaymentAmount() {
        System.out.println(getPrice());
    }
}
