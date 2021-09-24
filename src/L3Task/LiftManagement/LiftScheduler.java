package L3Task.LiftManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LiftScheduler {
    // static HashMap<String, Integer> listAndPosition = new HashMap<>();
    static final String[] lifts = {"l1", "l2", "l3", "l4", "l5"};
    static int[] position = {0, 0, 0, 0, 0};
    static List<Integer> liftpostition = new ArrayList<>(lifts.length);
    static List<String> liftsList = new ArrayList<>(lifts.length);

    public static void loadLift() {
        for (int i = 0; i < lifts.length; i++) {
            liftsList.add(lifts[i]);
            liftpostition.add(position[i]);
        }
    }

    public static List<Integer> getLiftPostion() {
        if (liftpostition == null && liftsList == null) {
            loadLift();
        }
        return liftpostition;
    }

    public static int setLiftPosition(String lift, int position) {
        int index = liftsList.indexOf(lift);
        liftpostition.set(index, position);
        return position;
    }

    public static String scheduleLift(int current, int origin) {
        String asingnedLift = checkNearest(current,origin);
        setLiftPosition(asingnedLift, origin);
        return asingnedLift;
    }

    public static String checkNearest(int current, int origin) {
        int index = 0;
        int diff=Integer.MAX_VALUE;
        for (int i = 0; i <liftpostition.size(); i++) {
            int postion =liftpostition.get(i);
            int temp= Math.abs(postion-current);
            //when diff equal and current place > destination and downward position
            /*.Example: if the user requests to move from 4 to 2 ,and if L3 is on the 5th floor & L5 is on the 3rd floor,
           then we should assign L3 because the user requested for downward motion so L3 i'll move down from 5th floor.*/
            if(diff == temp && current>origin && postion>current){
                return liftsList.get(i);
            }
            if(diff > temp){
                diff = temp;
                index=i;
            }
        }
        return liftsList.get(index);
    }
//        if(current>=0 && origin<=5){
//            //L1 or L2
//            String lift1= "l1";
//            String lift2= "l2";
//            int l1posn = listAndPosition.get(lift1);
//            int l2posn =listAndPosition.get(lift2);
//            if( l1posn!= -1 && l2posn!= -1 && l1posn>=l2posn) return lift2;
//            else return lift1;
//        }
//        else if(current>=6 && current<=10 && origin>=6 && origin<=10){
//            //l3 or l4
//            String lift3= "l3";
//            String lift4= "l4";
//            int l3posn = listAndPosition.get(lift3);
//            int l4posn =listAndPosition.get(lift4);
//            if(l3posn!= -1 && l4posn!= -1 && l3posn>=l4posn) return lift4;
//            else return lift3;
//        }
//        else if(current>=0 && origin<=10){
//            String lift5= "l5";
//            int l5posn = listAndPosition.get(lift5);
//            if(l5posn!= -1) return lift5;
//        }


}
