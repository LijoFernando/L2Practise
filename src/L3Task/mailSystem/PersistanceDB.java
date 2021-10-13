package L3Task.mailSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersistanceDB {
    private static Map<String, User> userProfile = new HashMap<>();
    private static List<String> userEmailAndUserName = new ArrayList<>();

    private static Map<String, Group> userGroup = new HashMap<>();
    private static List<String> groupEmailAndGroupName = new ArrayList<>();

    public static  Map<String, List<Mail>> userMails = new HashMap<>();

    private static Map<String, Map<String, List<Mail>>> mailsDB = new HashMap<>();

    public static Map<String, User> getUserProfile() {
        return userProfile;
    }

    public static List<String> getUniqueEmailUserName() {
        return userEmailAndUserName;
    }

    public static Map<String, Group> getUserGroup() {
        return userGroup;
    }

    public static List<String> getGroupEmailGroupName() {
        return groupEmailAndGroupName;
    }

    public static  Map<String, List<Mail>> getUserMails(){
        return userMails;
    }
    public static Map<String, Map<String, List<Mail>>> getWholeMails() {
        return mailsDB;
    }
}
