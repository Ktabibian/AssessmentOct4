package redo;

public class Main {
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.FLIGHT_ATTENDANT;

        CrewMember crewMember1 = new CrewMember("Mike", flightCrewJob1, 100000.0f);
        CrewMember crewMember2 = new CrewMember("Jim", flightCrewJob2, 90000.0f);
        CrewMember crewMember3 = new CrewMember("Betty", flightCrewJob3, 70000.0f);

        PlaneTicket ticket1 = new PlaneTicket(573, "Dallas", "Atlanta", "27B", 100.0);
        BusTicket ticket2 = new BusTicket(267, "Wilmington", "Bethlehem", "6C", 50.0);

        Passenger passenger57 = new Passenger("Chris", ticket1, 1000.0, new String[]{"satchel", "suitcase", "tote bag"});
        Passenger passenger07 = new Passenger("Kate", ticket2, 800.0, new String[]{"pocket book", "suitcase"});

        System.out.println(passenger57.getAmtOfLuggage());
        passenger07.printTicket();
        crewMember3.serve(passenger57);
    }
}
