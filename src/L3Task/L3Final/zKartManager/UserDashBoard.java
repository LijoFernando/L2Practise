package L3Task.L3Final.zKartManager;

import CustomException.CustomizedException;

import java.util.List;
import java.util.Scanner;

public class UserDashBoard {
    static Scanner input = new Scanner(System.in);

    public static void userPage(String username) throws CustomizedException {
        System.out.println("***********************************************************");
        System.out.println("Welocme " + username + " to Z-Kart");
        System.out.println("Enter ur choice 1.Show Product List, 2.Password Change, 0.Logout");
        int choice = input.nextInt();
        boolean isRepeat = true;
        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("&&&&&%%%{ Select The Product you Need }%%%&&&&&");
                    getProductByCategory();
                    break;
                case 0:
                    System.out.println("LogOut Successfully!!");
                    isRepeat = false;

            }
        }
    }

    public static void getProductByCategory() throws CustomizedException {
        List<String> categoryList = DbDriver.geProductCategory();
        for (int j = 0; j < categoryList.size(); j++) {
            System.out.println((j + 1) + ". " + categoryList.get(j));
        }
    }


}
