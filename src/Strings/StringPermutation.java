package Strings;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
    //ABCD--> ABCD,BACD,BCAD.BCDA
    // static Set<String> result = new HashSet<>();
    static int count = 0;

    public static void permuteString(char[] letters, int l, int r) {

        if (l == r) {
            count++;
            System.out.println(String.valueOf(letters));
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(letters, l, i);
            permuteString(letters, l + 1, r);
            swap(letters, l, i);
        }
    }

    public static void swap(char[] letters, int first, int next) {
        char temp = letters[first];
        letters[first] = letters[next];
        letters[next] = temp;
    }

    public static void main(String[] args) {
        String word = "AB";
        char[] ltrAry = word.toCharArray();
        int left = 0;
        int right = word.length() - 1;
        permuteString(ltrAry, left, right);
        System.out.println(count);
    }
}
