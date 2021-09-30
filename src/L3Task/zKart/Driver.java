package L3Task.zKart;

import L3Task.L3Final.zKartManager.DbDriver;
import L3Task.L3Final.zKartManager.StockManager;
import L3Task.L3Final.zKartManager.UserSignUp;


import java.util.Scanner;

public class Driver {
UserSignUp userSignUp = new UserSignUp();
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean check = true;
        while(check){
            System.out.println("Choose one 1.Register New User, 2.Stock load, 3. show UserList");
            int choice = input.nextInt();
            switch (choice){
                case 1:{
                    UserSignUp register = new UserSignUp();
                    register.register();
                    register.fileRead();
                    break;
                }
                case 2:{
                    StockManager stock = new StockManager();
                    stock.fileRead();
                    break;
                }
                case 3:
                {
                    System.out.println( DbDriver.getUserList().entrySet());
                    System.out.println( DbDriver.getProductList().entrySet());
                    break;
                }
                case 0:
                    System.out.println("Exited");
                    System.exit(0);
                    break;
            }
        }
    }
}
