package Pattern;

public class DiamondPattern {
    public static void printDiamond(int layers) {
        for (int i = 1; i < layers; i++) {
            for (int j = i; j < layers-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <layers; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <layers-1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        int layers = 7;
        printDiamond(layers);
    }
}
