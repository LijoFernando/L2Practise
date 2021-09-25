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

    public void inputDetails() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Details");
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());
        char prefBreth = (char) br.read();
        String status = "No TicketsAvailable";
        if (avTkt.isAvailable()) {
            bookticket(name, age, prefBreth);
        }
        //System.out.println(status);
    }

    public void bookticket(String name, int age, char prefbreth) {
        passInfo.setBookID(generateTickets.getBookID());
        passInfo.setName(name);
        passInfo.setAge(age);
        passInfo.setPrebreth(avTkt.allotBreth(prefbreth));
        char alotedBreath = passInfo.getPrebreth();
        passInfo.setAllotedBreth(avTkt.allotSeat(alotedBreath));
        passInfo.setStatus(avTkt.getStatus(alotedBreath));
        int bookID = passInfo.getBookID();
        passengerMap.put(bookID, passInfo);
        System.out.println("Map "+passengerMap);
       // return passengerMap.get(bookID).toString();
    }

    public Map<Integer, PassengerInfo> getPassengerList() {
        if (!passengerMap.isEmpty()) {
            return passengerMap;
        }
        return null;
    }
}

