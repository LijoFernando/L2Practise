package L3Task.trainTicket;

import java.util.ArrayList;
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
}
