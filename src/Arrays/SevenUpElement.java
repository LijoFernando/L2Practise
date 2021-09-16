package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SevenUpElement {
    /*.Print the 7up element in the given array
An element in an array is 7up if its previous element is divisible by 7. The first
element in the array is always a 7up element.
Sample Input 1:
Enter the array size : 6
Input : 16 17 49 3 77 21
Output : 16 3 21
Explanation : 16 is the first element. Previous element to 3, 49 is divisible by 7.
Similarly previous element to 21, 77 is divisible by 7.
Sample Input 2:
Enter the array size : 5
Input : 1 0 7 14 21
Output : 1 7 14 21
Sample Input 3:
Enter the array size : 8
Input : 18 21 32 49 17 1 35 5
Output : 18 32 17 5.*/
    public static List<Integer> getSevenUp(int [] arr, int length){
        List<Integer> sevenUpList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if(i==0) sevenUpList.add(arr[i]);
            if(i>0){
                if(arr[i-1]%7!=0) continue;
                sevenUpList.add(arr[i]);
            }
        }
        return sevenUpList;
    }

    public static void main(String[] args) {
        int arr[] ={18, 21, 32, 49, 17, 1, 35, 5};
        System.out.println(Arrays.deepToString(getSevenUp(arr, arr.length).toArray()));
    }
}
