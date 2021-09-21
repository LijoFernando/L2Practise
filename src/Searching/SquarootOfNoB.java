package Searching;

public class SquarootOfNoB {

//    Square root of a number
//    Medium Accuracy: 52.21% Submissions: 79457 Points: 4
//    Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).
//
//
//
//    Example 1:
//
//    Input:
//    x = 5
//    Output: 2
//    Explanation: Since, 5 is not a perfect
//    square, floor of square_root of 5 is 2.
//    Example 2:
//
//    Input:
//    x = 4
//    Output: 2
//    Explanation: Since, 4 is a perfect
//    square, so its square root is 2.
//
//
//    Your Task:
//    You don't need to read input or print anything. The task is to complete the function floorSqrt() which takes x as the input parameter and return its square root.
//    Note: Try Solving the question without using sqrt Function.
//
//
//
//    Expected Time Complexity: O(log N)
//    Expected Auxiliary Space: O(1)
//
//
//
//    Constraints:
//            1 ≤ x ≤ 107
    public static long getRoot(long no) {
        long i = 0;
        long j = no;
        long ans = 0 ;
        while(i<=j) {
            long mid = (i+j)/2;
            if(mid*mid == no) return mid;
            else if(mid*mid<no){
                ans = mid;
                i = mid + 1;
            }
            else {
                j = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getRoot(99));
    }
}
