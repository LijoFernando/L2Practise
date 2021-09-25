package L3Task.trainTicket;

import java.util.HashMap;
import java.util.Map;


public class Tickets {

    static Map<String, Integer> map = new HashMap<>();

    public static void loadTickets() {
        map.put("upBreth", 0);
        map.put("midBreth", 0);
        map.put("lwBreth", 0);
        map.put("rAC", 1);
        map.put("wList", 10);
        map.put("ticketNo", 0);
    }

    public static Map getAllTicketsCount() {
        if (map.isEmpty()) {
            loadTickets();
        }
        return map;
    }

    public String reAllocateTicket(char breth) {
        return "Rellocated";
    }

    public void getTicketsCount() {
        System.out.println(Tickets.getAllTicketsCount().entrySet());
    }

}
