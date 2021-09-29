package L3Task.TrainReservationSystem;

import java.util.HashMap;

public class OnlineReservationSystem {
    static HashMap<Integer, User> signInList = new HashMap<>();
    static HashMap<Integer, TicketForm> allocatedTicketList = new HashMap<>();
    static HashMap<Integer, String[]> trainList = new HashMap<>();

    public static void loadTrainList() {
        String[] classType = {"AC", "Sleeper", "Sitting"};
        int[] trains = {5343, 2345, 2552, 7283};
        for (int i = 0; i < trains.length; i++) {
            trainList.put(trains[i], classType);
        }
    }

    public static int signup(String usrName, String password) {
        Integer userId = (int) (Math.random() * 10000);
        User userDao = new User();
        userDao.setUserid(userId);
        userDao.setUsername(usrName);
        userDao.setPassword(password);
        signInList.put(userId, userDao);
        System.out.println(signInList.entrySet());
        return userId;
    }

    public static String login(int userId, String password) {
        String status = "user not Valid";
        if (signInList.containsKey(userId)) {
            User user = signInList.get(userId);
            if (password.equals(user.getPassword())) {
                status = "Hai " + user.getUsername() + ", Login Successfully";
            }
        }
        return status;
    }

    public static String applyReserve(Integer cusId, TicketForm ticketForm) {
        String message = "Invalid Customer ID: Plz SigUp";
        if (signInList.containsKey(cusId)) {

            int pnr = (int) (Math.random() * 100000);
            int trainNumber = ticketForm.getTrainNo();
            String selectClass = ticketForm.getClassType();
            String classType = trainSearch(trainNumber, selectClass);
            System.out.println(classType);
            if (classType == null) {
                return "ClassType Not Found";
            }
            ticketForm.setStatus("confirm");
            ticketForm.setPnr(pnr);
            allocatedTicketList.put(pnr, ticketForm);
            System.out.println(ticketForm.toString());
            message = "your PNR is: " + pnr + " Form Submitted Successfully%%";
        }
        return message;
    }

    public static String trainSearch(int trainNo, String classType) {
        if (trainList.containsKey(trainNo)) {
            String[] classList = trainList.get(trainNo);
            for (String s : classList) {
                if (classType == s) return s;
                else return "Sitting";
            }
        }
        return null;
    }

    public static String cancelTicket(int pnr) {
        String message = "Ticket Cancellation UnSuccessful";
        if (allocatedTicketList.containsKey(pnr)) {
            message = "Ticket Cancelled Successfully";
            TicketForm ticket = allocatedTicketList.get(pnr);
            ticket.setStatus("Cancelled");
            allocatedTicketList.put(pnr, ticket);
        }
        return message;
    }

    public static void getPNREnquiry(int pnr) {
        System.out.println(allocatedTicketList.get(pnr).toString());
    }
}
