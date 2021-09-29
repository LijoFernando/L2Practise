package L3Task.L3Final.zKartManager;

import CustomException.CustomizedException;
import Pojo.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class ChangeUserPassword {
    static HashMap<String, Queue<String>> passwordsList = new HashMap<>();
    static Map<String, User> userList;


    public static void changePassword(String username, String password) throws CustomizedException {
        String encryptPassword = PasswordEncryption.encryptPassword(password);
        passwordExist(username, encryptPassword);
        userList = DbDriver.getUserList();
        User user = userList.get(username);
        user.setPassword(encryptPassword);


    }

    public static void passwordExist(String username, String encPassword) {
        Queue<String> remainderPasswords = passwordsList.get(username);
        if (remainderPasswords.isEmpty()) {
            System.out.println("No Passwords");
            return;
        } else {
            for (String i : remainderPasswords) {
                if (encPassword.equals(i)) {
                    System.out.println("this Password Already User, Try new");
                    return;
                }
            }
        }
    }

    public static void maintainPassword(String username, String password) {
        Queue<String> restedPassword;
        if (passwordsList.containsKey(username)) {
            restedPassword = passwordsList.get(username);
            if (restedPassword.size() == 3) {
                restedPassword.remove();
            }
            restedPassword.add(password);
        }
    }
}
