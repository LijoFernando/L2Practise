package sorting;

public class ValidIp {

    public static boolean isValid(String ip) {
        // Write your code here
        String[] digits = ip.split("\\.");
        if (digits.length == 0) return false;
        if (digits.length != 4) return false; //  System.out.println("am here");
        for (String str : digits) {
            long port;
            try {
                port = Long.parseLong(str);
                if (!(port >= 0 && port <= 255))
                    return false;  //  System.out.println("am here"); System.out.println(port);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ip = "0000.0000.0000.0000";
        System.out.println(isValid(ip));
    }

}
