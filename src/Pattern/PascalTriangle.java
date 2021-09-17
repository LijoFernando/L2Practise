package Pattern;

public class PascalTriangle {
    public static void pyramidOfNumbers(int n) {
        for (int i = 1; i <n; i++) {
//            for (int j = 1; j <n-i ; j++) {
//                System.out.print(" ");
//            }
            for (int j = 1; j < i ; j++) {
                int value = 1;
                System.out.print(n*(n-j)/j+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int n =7;
        pyramidOfNumbers(n);
    }
}
