package L3Task.L3Final.zKartManager;

import CustomException.CustomizedException;
import Pojo.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class UserSignUp {
    static Map<String, User> userList = new HashMap<>();

    public static void register() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Ënter details");
        System.out.println("Enter name");
        String name = input.nextLine();
        System.out.println("Enter email");
        String mail = input.nextLine();
        System.out.println("Enter Password");
        String password = input.nextLine();
        System.out.println("Enter mobile");
        String mobileNo = input.nextLine();
        List<String> userInput = new ArrayList<>();
        userInput.add(mail);
        userInput.add(name);
        userInput.add(password);
        userInput.add(mobileNo);
        inputCheck(userInput);

    }

    public static void inputCheck(List<String> userInput) throws Exception {
        String mail = userInput.get(0);
        String name = userInput.get(1);
        String password = userInput.get(2);
        String mobileNo = userInput.get(3);
        if (checkUsername(mail)) {
            System.out.println("UserName Already Exist");
            return;
        }
        User user = new User();
        user.setUsername(name);
        user.setEmail(mail);
        String encrypted = PasswordEncryption.encryptPassword(password);
        user.setPassword(encrypted);
        user.setCellNumber(mobileNo);
        fileWrite(user);
        userList.put(name, user);

    }

    public static boolean checkUsername(String username) {
        if (userList.containsKey(username)) {
            return false;
        }
        return true;
    }

    public static void fileWrite(User user) throws Exception {
        try {
            FileWriter fr = new FileWriter("zusers_db.txt", true);
            //fr.write("hai");
            fr.write(user.toString());
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void fileRead() throws CustomizedException {
        //zusers_db.txt
        try (BufferedReader br = new BufferedReader(new FileReader("zusers_db.txt"))) {
            for (String line; (line = br.readLine()) != null; ) {
                loadUserMap(line);
            }
        } catch (Throwable e) {
            throw new CustomizedException("fileNot User Data Not Found");
        }
    }

    public static void loadUserMap(String line) {
        String[] words = line.split(" ");
        // System.out.println(Arrays.toString(words));
        User user = new User();
        String mail = words[0];
        user.setEmail(mail);
        user.setPassword(words[1]);
        user.setUsername(words[2]);
        user.setCellNumber(words[3]);

    }


    public static Map<String, User> getUsers() throws CustomizedException {
        if (userList.isEmpty()) {
            fileRead();
        }
        return userList;
    }


}
