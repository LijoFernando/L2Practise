package L3Task.zKart.zKartManager;

import L3Task.zKart.Pojo.User;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        User user = new User();
        user.setUsername(name);
        user.setEmail(mail);
        String encrypted = PasswordEncryption.encryptPassword(password);
        user.setPassword(encrypted);
        user.setCellNumber(mobileNo);
        fileWrite(user);
        userList.put(name, user);
    }

    public static void fileWrite(User user) throws Exception {
        try {
            FileWriter fr = new FileWriter("zusers_db.txt");
            //fr.write("hai");
            fr.write(user.toString());
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void fileRead() throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("zusers_db.txt"))) {
            for (String line; (line = br.readLine()) != null; ) {
                loadUserMap(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadUserMap(String line) {
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));
        User user = new User();
        String mail = words[0];
        user.setEmail(mail);
        user.setPassword(words[1]);
        user.setUsername(words[2]);
        user.setCellNumber(words[3]);
        userList.put(mail, user);
     //   System.out.println(userList.entrySet());
    }

//    public static boolean checkUsername(String username) {
//        if (userList.containsKey(username)) {
//            System.out.println("Enter valid user");
//            return true;
//        }
//        return true;
//    }

    public static Map getMap() throws FileNotFoundException {
        if (userList.isEmpty()) {
            fileRead();
        }
        return userList;
    }


}
