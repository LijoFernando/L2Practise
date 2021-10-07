package L3Task.mailSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GroupManager {
    static Map<String, Group> userGroups = PersistanceDB.getUserGroup();
    static List<String> groupNameAndMail = PersistanceDB.getGroupEmailGroupName();

    public static boolean createGroup(List<String> groupDetails) {
        String groupName = groupDetails.get(0);
        if (groupMailAndNameCheck(groupName)) {
            String groupMail = groupDetails.get(1);
            if (groupMailAndNameCheck(groupMail)) {

                groupNameAndMail.add(groupName);
                groupNameAndMail.add(groupMail);

                String groupPassword = groupDetails.get(2);
                String groupDescription = groupDetails.get(3);
                String groupMembers = groupDetails.get(4);

                Group group = new Group();
                group.setUsername(groupName);
                group.setEmail(groupMail);
                group.setPassword(groupPassword);
                group.setDescription(groupDescription);
                group.setGroupMembers(new ArrayList<>());
                group.getGroupMembers().add(groupMembers);
                userGroups.put(groupName, group);

            } else return false;
        } else return false;
        return true;
    }

    public static boolean groupMailAndNameCheck(String groupMailOrName) {
        if (groupNameAndMail.contains(groupMailOrName)) return false;
        else return true;
    }

    public static void getGroupList() {
        for (Map.Entry group : userGroups.entrySet()) {
            System.out.println(group.getValue().toString());
        }
    }

    public static String addOrRemoveUser(String[] groupManipulateData) {

        String groupName = groupManipulateData[0];
        if (groupNameAndMail.contains(groupName)) {
            String userNameToManipulate = groupManipulateData[1];
            List<String> groupMembers = userGroups.get(groupName).getGroupMembers();
            String manuplation = groupManipulateData[2];
            if (manuplation.equals("Add") && !groupMembers.contains(userNameToManipulate)) {
                groupMembers.add(userNameToManipulate);
                return "User Added to Group";
            } else if (manuplation.equals("Remove") && groupMembers.contains(userNameToManipulate)) {
                groupMembers.remove(userNameToManipulate);
                return "User Removed From Group";
            }
            else return "User Exist / Removed Already";
        }
        else {
            return "Group Name DoesNot Exist";
        }
    }
}
