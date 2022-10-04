package redo;

import java.util.ArrayList;
import java.util.Collections;

public class FlightApp {
    public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> crewJobs){
        for (int i = 0; i < crewJobs.size(); i++){
            System.out.println(crewJobs.get(i));
        }
    }
    public static void printAmountForEachThingThatIsPayable(Payable[] payables){
        for(int i = 0; i < payables.length; i++){
            if(payables[i] instanceof CrewMember){
                System.out.println(((CrewMember) payables[i]).getSalary());
            }else if(payables[i] instanceof Ticket){
                System.out.println(((Ticket) payables[i]).getPrice());
            }
        }
    }
    public static void sortAndPrintFlightCrewJobsByTitle(ArrayList<FlightCrewJob> crewJobs){
        Collections.sort(crewJobs);
        System.out.println(crewJobs);
    }
    public static void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> crewJobs, CrewMember crewMember){
        Collections.sort(crewJobs);
        for (int i = 0; i < crewJobs.size(); i++){
            if(crewJobs.indexOf(i).contains(crewMember)){
                crewJobs.remove(crewMember);
            }
        }
        System.out.println(crewJobs);
    }
}
