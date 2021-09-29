package L3Task.L3Final.zKartManager;

import CustomException.CustomizedException;
import Pojo.User;

import java.util.Scanner;

public class Login {
    static Scanner input = new Scanner(System.in);

    public static void userLogin() throws CustomizedException {
        System.out.println("***********************************************************");
        System.out.println("Welocme to Login Page");
        System.out.println("Enter your Login Username:");
        String username = input.nextLine();
        System.out.println("Enter the password");
        String pass = input.nextLine();
        if (validateUser(username, pass)) {
            UserDashBoard.userPage(username);
        } else {
            System.out.println("Invalid username or password");
        }
    }

    public static boolean validateUser(String username, String password) throws CustomizedException {
        User user = (User) DbDriver.getUserList().get(username);
        if (user == null) {
            return false;
        } else {
            String storedPassword = user.getPassword();
            String ecryptedPassword = PasswordEncryption.encryptPassword(password);
            if (storedPassword.equals(ecryptedPassword)) return true;
        }
        return false;
    }

}
