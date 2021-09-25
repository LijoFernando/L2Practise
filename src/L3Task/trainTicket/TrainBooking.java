package L3Task.trainTicket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TrainBooking {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BookTicket bk = new BookTicket();

        Boolean exit = true;

        while (exit) {
            System.out.println("Select -> 1:BookTicket | 2: Show Tickets | 3. Cancel Ticket | 4.Show Booked Tickets |5.Ticket Enquiry |0.exit");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    bk.inputDetails();
                    break;
                case 2:
                    GenerateTickets gntkt = new GenerateTickets();
                    System.out.println(gntkt.toString());
                    break;
                case 3:
                    System.out.println("Enter Your BookID");
                    int bookID = Integer.parseInt(br.readLine());
                    CancelTicket cancelTkt = new CancelTicket();
                    System.out.println(cancelTkt.cancelTicketbyBookID(bookID));
                    break;
                case 4:
                    Set result = bk.getPassengerList().entrySet();
                    if (result != null) {
                        System.out.println(result);
                    }
                    System.out.println("Record List Reached");
                    break;
                case 5:
//                    System.out.println(Ënter);
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter BookID");
                    int a = input.nextInt();
                    Map<Integer, PassengerInfo> map = bk.getPassengerList();
                    System.out.println(map.get(a));
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
