package L3Task.mailSystem;

import L3Task.mailSystem.mailException.MailException;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailManager {
    static Map<String, User> userList = PersistanceDB.getUserProfile();
    static List<String> emailAndUserName = PersistanceDB.getUniqueEmailUserName();
    static Map<String, List<Mail>> userMails;
    static Map<String, Map<String, List<Mail>>> mailDao = PersistanceDB.getWholeMails();

    public static boolean composeMail(List<String> mailData, String mailType) throws MailException {
        String fromUsername = mailData.get(0);
        String to = mailData.get(1);
        if (!emailIdCheck(to) && !emailIdCheck(fromUsername)) {
            return false;
        }
        String senderMail = userList.get(fromUsername).getEmail();
        String subject = mailData.get(2);
        String content = mailData.get(3);
        Mail mail = getMail(senderMail, to, subject, content);
        if (mailDao.containsKey(senderMail)) {
            userMails = mailDao.get(senderMail);
            userMails.get(mailType).add(mail);
        } else {
            userMails = new HashMap<>();
            List<Mail> mailList = new ArrayList<>();
            mailList.add(mail);
            userMails.put(mailType, mailList);
            mailDao.put(senderMail, userMails);
        }

        return true;
    }

    public static boolean emailIdCheck(String username) throws MailException {
        if (!userList.isEmpty()) {
            return userList.containsKey(username);
        } else {
            throw new MailException("MailerProfile list are empty or not found");
        }
    }

    private static Mail getMail(String from, String to, String subject, String content) {
        Mail mail = new Mail();
        mail.setFrom(from);
        mail.setTo(to);
        mail.setSubject(subject);
        mail.setContent(content);
        return mail;
    }


    public static Map<String, List<Mail>> getUserMails(String username) {
        return mailDao.get(username);
    }
}
