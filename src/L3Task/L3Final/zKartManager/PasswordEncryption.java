package L3Task.L3Final.zKartManager;

public class PasswordEncryption {
    public static String encryptPassword(String password) {
        String encrypted = "";
        for (int i = 0; i < password.length(); i++) {
            int no = password.charAt(i);
            encrypted += ((char)( no + 1));
        }
        return encrypted;
    }
}
