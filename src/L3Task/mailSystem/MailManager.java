package L3Task.mailSystem;

import java.util.List;
import java.util.Map;

public class MailManager {
    static Map<String, User> userList = PersistanceDB.getUserProfile();
    static List<String> emailAndUserName = PersistanceDB.getUniqueEmailUserName();
    static Map<Integer, Mail> userMails = PersistanceDB.getUserMails();
    static Map<String, Map<Integer, Mail>> mailDao = PersistanceDB.getWholeMails();

    public static boolean composeMail(List<String> mailData) {
        String username = mailData.get(0);
        String from = userList.get(username).getEmail();
        String to = mailData.get(1);
        if (!emailAndUserName.contains(to)) return false;
        String subject = mailData.get(2);
        String content = mailData.get(3);

        Mail mail = new Mail();
        mail.setFrom(from);
        mail.setTo(to);
        mail.setSubject(subject);
        mail.setContent(content);
        int sID = getSId();
        userMails.put(sID, mail);
        mailDao.put(username, userMails);
        return true;
    }

    private static int getSId() {
        int sId = (int) (Math.random() * 10000);
        if (userMails.containsKey(sId)) {
            getSId();
        }
        return sId;
    }

    public static Map<Integer, Mail> getMails(String username) {
        return mailDao.get(username);
    }
}
