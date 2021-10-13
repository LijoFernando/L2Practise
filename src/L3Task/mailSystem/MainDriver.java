package L3Task.mailSystem;

import L3Task.mailSystem.mailException.MailException;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainDriver {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws MailException {

        while (true) {
            System.out.println("___________________________Email System___________________________________");
            System.out.println("Enter Your Choice");
            System.out.println("1.Create User,\n2.Create Group,\n3.Group Assignment,\n4.Compose Mail,\n5.Inbox," +
                    " \n0.Exit");
            int choice = input.nextInt();
            switch (choice) {

                case 1:

                    System.out.println("Enter UserName: ");
                    input.nextLine();
                    String userName = input.nextLine();
                    System.out.println("Enter Email: ");
                    String email = input.nextLine();
                    System.out.println("Enter Password: ");
                    String password = input.nextLine();
                    List<String> userDetails = new ArrayList<>();
                    userDetails.add(userName);
                    userDetails.add(email);
                    userDetails.add(password);
                    if (UserManager.createUser(userDetails)) {
                        System.out.println("______________________________________________________________");
                        System.out.println("Username        Email       Password");
                        UserManager.showUserProfile();
                    } else {
                        System.out.println("Username or email Already Used");
                    }
                    break;

                case 2:

                    System.out.println("_______________________Group Creation___________________");
                    System.out.println("Group Name");
                    input.nextLine();
                    String groupName = input.nextLine();
                    System.out.println("Group Email");
                    String groupMail = input.nextLine();
                    System.out.println("Password");
                    String groupPassword = input.nextLine();
                    System.out.println("Group Description");
                    String groupDescription = input.nextLine();
                    System.out.println("Group Member");
                    String groupMember = input.nextLine();

                    List<String> groupDetails = new ArrayList<>();
                    groupDetails.add(groupName);
                    groupDetails.add(groupMail);
                    groupDetails.add(groupPassword);
                    groupDetails.add(groupDescription);
                    groupDetails.add(groupMember);
                    if (GroupManager.createGroup(groupDetails)) {
                        System.out.println("_____________________Group List__________________");
                        GroupManager.getGroupList();
                    }
                    break;

                case 3:

                    System.out.println("___________________Group Assignment____________________");
                    System.out.println("Group Name: ");
                    input.nextLine();
                    String groupUserName = input.nextLine();
                    System.out.println("User: ");
                    String username = input.nextLine();
                    System.out.println("Add or Remove: ");
                    String manipulate = input.nextLine();
                    String[] manipulateInput = new String[3];
                    manipulateInput[0] = groupUserName;
                    manipulateInput[1] = username;
                    manipulateInput[2] = manipulate;
                    System.out.println(GroupManager.addOrRemoveUser(manipulateInput));
                    break;

                case 4:

                    System.out.println("________________Compose_Mail_________________________________");
                    System.out.println("Enter username");
                    input.nextLine();
                    String mailerName = input.nextLine();
                    System.out.println("Enter Sender MailId");
                    String to = input.nextLine();
                    System.out.println("Mail Subject");
                    String subject = input.nextLine();
                    System.out.println("Mail Content");
                    String content = input.nextLine();

                    List<String> mailData = new ArrayList<>();
                    mailData.add(mailerName);
                    mailData.add(to);
                    mailData.add(subject);
                    mailData.add(content);
                    if (MailManager.composeMail(mailData, "Sent")) {
                        System.out.println("Mail sent");
                    }
                    break;

                case 5:

                    System.out.println("___________________MY_INBOX___________________________________");
                    System.out.println("Enter UserName");
                    input.nextLine();
                    String mailUserName = input.nextLine();

                    Map<String, List<Mail>> userMails = MailManager.getUserMails(mailUserName);

                    if (userMails != null) {
                        for (Map.Entry mail : userMails.entrySet()) {
                            System.out.println(mail.getKey() + "        " + mail.getValue().toString());
                        }
                    } else {
                        System.out.println("Empty userMails");
                    }

                    break;

                case 0:
                    System.out.println("System Exited");
                    System.exit(0);
            }
        }
    }
}
