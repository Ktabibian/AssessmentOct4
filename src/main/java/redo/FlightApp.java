package redo;

import java.util.ArrayList;

public class FlightApp {
    public void printEachFlightCrewJob(ArrayList<FlightCrewJob> crewJobs){

    }
    public void printAmountForEachThingThatIsPayable(Payable[] payables){
        for(int i = 0; i < payables.length; i++){
            payables[i] = payables[i].printPaymentAmount();
        }
    }
    public void sortAndPrintFlightCrewJobsByTitle(ArrayList<FlightCrewJob> crewJobs){

    }
    public void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> crewJobs, CrewMember crewMember){

    }
}
