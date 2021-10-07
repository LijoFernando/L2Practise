package L3Task.mailSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<String> groupMembers) {
        this.groupMembers = groupMembers;
    }

    private String username;
    private String email;
    private String password;
    private String description;
    private List<String> groupMembers;

    @Override
    public String toString() {
        return "Group{" +
                "Group Name='" + username + '\'' +
                ",Group Email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", groupMembers=" + Arrays.deepToString(groupMembers.toArray()) +
                '}';
    }
}
