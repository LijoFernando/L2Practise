package recursion;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringWithOperator {
    static String concat = "";
    static long sum = 0;
    public static String concateOperator(long first, String rem, int target, String exp ){

        if(rem.length() ==0){
            if(sum == target){
                System.out.println(concat);
            }
        }
        else{
            for (int i = 0; i < rem.length(); i++) {
                long next = (long) rem.charAt(i);
                sum = sum + first;
                exp = exp + "+" + rem.charAt(i);
                concateOperator((long)first + next, rem.substring(i + 1),target, exp);
                concat = "" + exp;
            }

            System.out.println(sum);
        }
        return concat;
    }

    public static void main(String[] args) {
        String word = "123";
        int target = 6;
        for (int i = 0; i<word.length(); i++) {
            long first =Long.parseLong(word.substring(0,i+1));
            String rem = word.substring(i+1);
            String exp =String.valueOf(first);
            concateOperator(first,rem,target,exp);
        }
    }

}
