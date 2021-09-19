package sorting;

import java.util.Arrays;

public class MergeSort {
    //merger
    public static void sort(int[] arr, int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] aryLeft = new int[n1];
        int[] aryRight = new int[n2];
        for (int i = 0; i < n1; i++) aryLeft[i]= arr[left+i];
        for (int j = 0; j < n2; j++) aryRight[j]= arr[mid+1+j];
        System.out.print(Arrays.toString(aryLeft)+" ");
        System.out.print(Arrays.toString(aryRight)+" ");
        System.out.println();

        //check subaarray from i1....& i2......
        int i1=0,i2=0;
        int k =left;
        while(i1<n1 && i2<n2){
            if(aryLeft[i1]>=aryRight[i2]) {
                arr[k]= aryRight[i2];
                i2++;
            }
            else{
                arr[k]=aryLeft[i1];
                i1++;
            }
            k++;
        }
        //Remaining ELements push into Main arry
        while(i1<n1){
            arr[k]=aryLeft[i1];
            i1++;
             k++;
        }
        while(i2<n2){
            arr[k]=aryRight[i2];
            i2++;
            k++;
        }

    }

    //sort
    public static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
         //   System.out.print(arr[mid] + " ");
          mergeSort(arr, start, mid);
           mergeSort(arr, mid+1, end);
            sort(arr, start, mid, end);
        }
    }

    //main
    public static void main(String[] args) {
        int[] arr = {6, 5, 12, 10, 9, 1};
        int start = 0;
        int end = arr.length-1;
        mergeSort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }
}
