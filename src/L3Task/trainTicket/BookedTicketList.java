package L3Task.trainTicket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookedTicketList {
    static List<Integer> confirmedTicketList = new ArrayList<>();
    static List<Integer> racTicketsList = new ArrayList<>();
    static List<Integer> waitingList = new ArrayList<>();

    public static void splitTickets(String ticketStatus, Integer bookId) {
        if (ticketStatus == "confirm") {
            confirmedTicketList.add(bookId);
        } else if (ticketStatus == "waiting") {
            waitingList.add(bookId);
        } else if (ticketStatus == "rac") {
            racTicketsList.add(bookId);
        }
    }
    public static void getBookedTicketsByCategory(){
        System.out.println("Confirmed Tickets: "+Arrays.deepToString(confirmedTicketList.toArray()));
        System.out.println("RAC Tickets: "+Arrays.deepToString(confirmedTicketList.toArray()));
        System.out.println("WaitingList Tickets: "+Arrays.deepToString(confirmedTicketList.toArray()));
    }
}
