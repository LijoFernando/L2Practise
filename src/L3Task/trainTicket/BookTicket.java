package L3Task.trainTicket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class BookTicket {
    static Map<Integer, PassengerInfo> passengerMap  = new HashMap<>();
    PassengerInfo passInfo = new PassengerInfo();
    GenerateTickets avTkt = new GenerateTickets();
    GenerateTickets generateTickets = new GenerateTickets();
    BookedTicketList bookedTicketList = new BookedTicketList();
    public void inputDetails() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Details");
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());
        char prefBreth = (char) br.read();
        String status = "No TicketsAvailable";
        if (avTkt.isAvailable()) {
           status = bookticket(name, age, prefBreth);
        }
        System.out.println(status);
    }

    public String bookticket(String name, int age, char prefbreth) {
        passInfo.setBookID(generateTickets.getBookID());
        passInfo.setName(name);
        passInfo.setAge(age);
        char alotedBreth =avTkt.allotBreth(prefbreth);
        String status = avTkt.getStatus(alotedBreth);
       // System.out.println(status);
        int bookID = passInfo.getBookID();
        passInfo.setPrebreth(alotedBreth);
        passInfo.setAllotedBreth(avTkt.allotSeat(alotedBreth));
        passInfo.setStatus(status);
        bookedTicketList.splitTickets(status,bookID);
        passengerMap.put(bookID, passInfo);
       // System.out.println("Map "+passengerMap);
        return passengerMap.get(bookID).toString();
    }

    public Map<Integer, PassengerInfo> getPassengerList() {
        if (!passengerMap.isEmpty()) {
            return passengerMap;
        }
        return null;
    }
}

