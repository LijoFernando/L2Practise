package L3Task.LiftManagement;

import L3Task.TrainReservationSystem.InputLayer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class inputLayer {
    static Scanner input = new Scanner(System.in);
    static LiftScheduler liftScheduler = new LiftScheduler();

    public static void asignLift() {
        liftScheduler.getLiftPostion();
        System.out.println("Enter your floor  1 to 10");
        int current = input.nextInt();
        System.out.println("Enter floor to Go");
        int origin = input.nextInt();
        System.out.println("Lift : " + liftScheduler.scheduleLift(current, origin) + "is Assaigned");
    }

    public static void main(String[] args) {
        LiftScheduler.loadLift();
        List<Integer> liftposition = liftScheduler.getLiftPostion();
        while (true) {
            System.out.println("Enter ur choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println(Arrays.deepToString(liftposition.toArray()));
                    asignLift();
                    break;
                }
            }
        }
    }
}
