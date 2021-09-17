package Pattern;

public class FlippedTriangle {
    public static void printFlipTriangle(int layers){
        for (int i = 0; i < layers; i++) {
            for (int j = i; j < layers; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int layers = 7;
        printFlipTriangle(layers);
    }
}
