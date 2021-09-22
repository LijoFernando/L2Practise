public class Sample {
    static int minThrow(int N, int arr[]) {
        // code here
        int least = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
           // if (arr[i + 1] < arr[i]) break;
            int temp = travel(arr, i);
            System.out.print(temp+" temp");
            System.out.println();
            if (temp < least) least = temp;
            i++;
        }
        System.out.println(least);
        return least;
    }

    static int count(int start) {
        int count = 1;
        if (start > 6) count += (int) Math.ceil(start / 6);
        return count;
    }

    static int travel(int[] arr, int j) {
        int end = 30;
        int count = count(arr[j]);
        int stand = Integer.MIN_VALUE;
        for (int i = j; i < arr.length - 1; i++) {

            if (stand < arr[i]) {
                if (arr[i + 1] > arr[i]) {
                    count++;
                    stand = arr[i + 1];
                    // System.out.print(stand+" travel() ");
                }
            }
            i++;
        }
        count += (int) Math.ceil((end - stand) / 6);
        return count;
    }
}
