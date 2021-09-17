package Pattern;

public class LeftTriangle {
    public static void printLTriangle(int layers){
        for (int i = 0; i <= layers; i++) {
            for (int j =0 ; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int layers = 7;
        printLTriangle(layers);
    }
}
