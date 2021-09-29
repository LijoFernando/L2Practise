package L3Task.TrainReservationSystem;

import java.util.Scanner;

public class InputLayer {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        //signup
        while (true) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("● Signup.\n" +
                    "● Login.\n" +
                    "● Reservation.\n" +
                    "● Cancellation.\n" +
                    "● PNR Enquiry.");
            System.out.println("Enter your Choice");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Enter user name :");
                    String usrName = input.nextLine();
                    System.out.println("Enter password :");
                    String password = input.nextLine();
                    OnlineReservationSystem onReserve = new OnlineReservationSystem();
                    int userid = onReserve.signup(usrName, password);
                    System.out.println("Note this userid : " + userid + " LogIn with password");
                    break;
                }
                case 2: {
                    System.out.println("Enter userId :");
                    Integer userId = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter password :");
                    String password = input.nextLine();
                    OnlineReservationSystem onReserve = new OnlineReservationSystem();
                    System.out.println(onReserve.login(userId, password));
                    break;
                }
                case 3: {
                    System.out.println("Enter userId :");
                    Integer userId = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter Passanger name :");
                    String Name = input.nextLine();
                    System.out.println("Enter your age :");
                    Integer age = input.nextInt();
                    System.out.println("Enter Train no:");
                    Integer trainNo = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter Train Name:");
                    String trainName = input.nextLine();
                    System.out.println("Enter Train ClassType:");
                    String classType = input.nextLine();
                    System.out.println("Enter Journey Date:");
                    String date = input.nextLine();
                    System.out.println("Enter Origin:");
                    String origin = input.nextLine();
                    System.out.println("Enter destination");
                    String destination = input.nextLine();
                    TicketForm ticketform = new TicketForm();
                    ticketform.setName(Name);
                    ticketform.setAge(age);
                    ticketform.setTrainNo(trainNo);
                    ticketform.setTrainName(trainName);
                    ticketform.setClassType(classType);
                    ticketform.setDateJourney(date);
                    ticketform.setOrigin(origin);
                    ticketform.setDestination(destination);
                    OnlineReservationSystem onReserve = new OnlineReservationSystem();
                    onReserve.loadTrainList();
                    System.out.println(onReserve.applyReserve(userId, ticketform));
                    break;
                }
                case 4: {
                    System.out.println("Cancelling Ticket Page");
                    System.out.println("Enter yout PNR Number:");
                    int pnr = input.nextInt();
                    OnlineReservationSystem onReserve = new OnlineReservationSystem();
                    System.out.println(onReserve.cancelTicket(pnr));
                    break;
                }
                case 5: {
                    System.out.println("Enter yout PNR Number:");
                    int pnr = input.nextInt();
                    OnlineReservationSystem onReserve = new OnlineReservationSystem();
                    onReserve.getPNREnquiry(pnr);
                    break;
                }
                case 10: {
                    System.out.println("break");
                    System.exit(0);
                }
            }
        }

    }
}
