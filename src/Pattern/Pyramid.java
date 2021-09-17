package Pattern;

public class Pyramid {
    public static void printPyramid(int layers){
        for (int i = 0; i <= layers; i++) {
            for (int j =0 ; j<layers-i; j++) {
                System.out.print(" ");
            }
            for (int j =0 ; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int layers = 7;
        printPyramid(layers);
    }
}
