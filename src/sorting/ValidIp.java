package sorting;

public class ValidIp {
    public static boolean isValid(String ip) {

        String[] digits = ip.split("\\.");
        if (digits.length > 4)
            //  System.out.println("am here");
            return false;

        for (String str : digits) {
            //   if(str.contains('a'))
            long port = Long.parseLong(str);
            if (!(port >= 0 && port <= 255))
                //  System.out.println("am here");
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        String ip = "74.3.87.78";
        System.out.println(isValid(ip));
    }
}
