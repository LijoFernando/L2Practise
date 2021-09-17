package Array2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindStringMatrix {
//    Find the string in grid
//    Medium Accuracy: 40.03% Submissions: 8265 Points: 4
//    Given a 2D grid of n*m of characters and a word, find all occurrences of given word in grid. A word can be matched in all 8 directions at any point. Word is said be found in a direction if all characters match in this direction (not in zig-zag form). The 8 directions are, horizontally left, horizontally right, vertically up, vertically down and 4 diagonal directions.
//
//
//    Example 1:
//
//    Input: grid = {{a,b,c},{d,r,f},{g,h,i}}, word = "abc"
//    Output: {{0,0}}
//    Expalnation: From (0,0) one can find "abc"
//    in horizontally right direction.
//    Example 2:
//
//    Input: grid = {{a,b,a,b},{a,b,e,b},{e,b,e,b}},word = "abe"
//    Output: {{0,0},{0,2},{1,0}}
//    Explanation: From (0,0) one can find "abe" in
//    right-down diagonal. From (0,2) one can
//    find "abe" in left-down diagonal. From
//            (1,0) one can find "abe" in Horizontally right
//    direction.
//
//
//    Your Task:
//    You don't need to read or print anyhting, Your task is to complete the function searchWord() which takes grid and word as input parameters and returns a list containg the positions from where the word originates in any direction. If there is no such position then returns an empty list.
//
//    Note: The returning list should be lexicographically smallest. If the word can be found in multiple directions strating from the same coordinates, the list should contain the coordinates only once.
//
//
//    Expected Time Complexity: O(n*m*k) where k is constant
//    Exected Space Complexity: O(1)
//
//
//    Constraints:
//            1 <= n <= m <= 100
//            1 <= |word| <= 10
        public static void getWord(char matrix[][], int length, String word){
            List<int[]> indexList = new ArrayList<>();
            int chari = 0;
           outer: for (int i = 0; i <=length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if(word.charAt(chari)==matrix[i][j]){
                        int[] axis = new int[2];
                        axis[0]=i;
                        axis[1]=j;
                        indexList.add(axis);
                        ++chari;
                    }
                    if(chari == word.length()){
                        break outer;
                    }
                }
            }
            if(word.length()-chari ==0) {
                System.out.println(Arrays.deepToString(indexList.toArray()));
            }
            else{
                System.out.println("word not Found");
            }
        }

    public static void main(String[] args) {
        char matrix[][] = {{'a','b','c'},{'d','r','f'},{'g','h','i'}};
        int length = matrix.length;
        String word ="abc";
        getWord(matrix,length,word);
    }
}
