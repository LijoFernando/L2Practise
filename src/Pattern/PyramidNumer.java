package Pattern;

public class PyramidNumer {
    public static void pyramidOfNumbers(int n) {
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int n =7;
        pyramidOfNumbers(n);
    }
}