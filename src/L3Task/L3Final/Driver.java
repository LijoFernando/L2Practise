package L3Task.L3Final;

import zKartManager.DbDriver;
import zKartManager.Login;
import zKartManager.UserSignUp;

import java.util.Scanner;

public class Driver {
    UserSignUp userSignUp = new UserSignUp();

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean check = true;
        while (check) {
            System.out.println("Choose one 1.SignUp User, 2.SignIn User, 3. show UserList and Stock Map, 0.Exit ");
            int choice = input.nextInt();
            switch (choice) {
                case 1: {
                    UserSignUp register = new UserSignUp();
                    register.register();
                    register.fileRead();
                    break;
                }
                case 2: {
                    Login userLogin = new Login();
                    userLogin.userLogin();
                    break;
                }
                case 3: {
                    System.out.println(DbDriver.getUserList().entrySet());
                    System.out.println(DbDriver.getProductList().entrySet());
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
