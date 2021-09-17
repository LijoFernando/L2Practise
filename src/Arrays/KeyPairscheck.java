package Arrays;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Scanner;

public class KeyPairscheck {
    /*.Key Pair
Easy Accuracy: 49.96% Submissions: 28111 Points: 2
Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
Example 2:

Input:
N = 5, X = 10
Arr[] = {1, 2, 4, 3, 6}
Output: Yes
Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
Your Task:
You don't need to read input or print anything. Your task is to complete the function hasArrayTwoCandidates() which takes the array of integers arr, n and x as parameters and returns boolean denoting the answer.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 105.*/
    public static boolean checkKeyPair(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            int rem = target - i;
            if (set.contains(rem)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter Target Element");
        int target = input.nextInt();
        System.out.println(checkKeyPair(arr, target));
    }
}
