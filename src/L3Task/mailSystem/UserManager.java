package L3Task.mailSystem;

import java.util.*;

public class UserManager {
    static List<String> userEmailAndUsername = PersistanceDB.getUniqueEmailUserName();
    static Map<String, User> userProfile = PersistanceDB.getUserProfile();

    public static boolean createUser(List userDetail) {
        String userName = userDetail.get(0).toString();
        String email = userDetail.get(1).toString();
        String password = userDetail.get(2).toString();
        if (userEmailNameCheck(userName)) {
            if (userEmailNameCheck(email)) {
                //add Unique Data
                userEmailAndUsername.add(userName);
                userEmailAndUsername.add(email);

                User user = new User();
                user.setUsername(userName);
                user.setEmail(email);
                user.setPassword(password);
                //user Profile Add
                userProfile.put(userName, user);
            } else return false;

        } else return false;
        return true;
    }

    public static boolean userEmailNameCheck(String userMailAndName) {
        if (userEmailAndUsername.contains(userMailAndName)) {
            return false;
        }
        return true;
    }

    public static void showUserProfile() {
        for (Map.Entry userProfile : userProfile.entrySet()) {
            System.out.println(userProfile.getValue().toString());
        }
    }
}
