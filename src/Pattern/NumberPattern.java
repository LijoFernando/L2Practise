package Pattern;

public class NumberPattern {
    public static void patternNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n = 7;
        patternNumbers(n);
    }

}
