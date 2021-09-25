package L3Task.trainTicket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookedTicketList {
     List<Integer> confirmedTicketList = new ArrayList<>();
     List<Integer> racTicketsList = new ArrayList<>();
     List<Integer> waitingList = new ArrayList<>();

    public void splitTickets(String ticketStatus, Integer bookId) {
        if (ticketStatus == "confirm") {
            confirmedTicketList.add(bookId);
        } else if (ticketStatus == "waiting") {
            waitingList.add(bookId);
        } else if (ticketStatus.equals( "rac")) {
            racTicketsList.add(bookId);
            System.out.println("RAC Tickets: "+Arrays.deepToString(confirmedTicketList.toArray()));
        }
    }
    public void getBookedTicketsByCategory(){
        System.out.println("Confirmed Tickets: "+Arrays.deepToString(confirmedTicketList.toArray()));
        System.out.println("RAC Tickets: "+Arrays.deepToString(confirmedTicketList.toArray()));
        System.out.println("WaitingList Tickets: "+Arrays.deepToString(confirmedTicketList.toArray()));
    }
}
