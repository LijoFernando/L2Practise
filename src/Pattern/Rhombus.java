package Pattern;

public class Rhombus {
    public static void printRhombus(int layers){
        for (int i = 0; i < layers; i++) {
            for (int j = i; j <layers; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < layers; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int layers = 7;
        printRhombus(layers);
    }
}
