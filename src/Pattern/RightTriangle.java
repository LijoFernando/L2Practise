package Pattern;

public class RightTriangle {
    public static void printRTriangle(int layers){
        for (int i = 0; i <= layers; i++) {
            for (int j = i*2; j <layers*2; j++) {
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
        printRTriangle(layers);
    }
}
