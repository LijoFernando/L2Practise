package L3Task.HashTable;

public class HashFunction {
    public static Integer getHashCode(String key) {
        char[] letter = key.toCharArray();
        int whSum = 0;
        int n = 0;
        for (char l : letter) {
            whSum += hashingOperation(l, n);
            n++;
            /*System.out.print(l + ",");*/
        }
        return whSum;
    }

    public static Integer hashingOperation(char l, int n) {
        int asci = l;
        int a = (int) Math.pow((int) 'a', (int) n);
        int sum = asci * a;
        // System.out.println(asci);
     //   System.out.println(asci + " =" + l + ", " + a);
    //    System.out.println(l + " =" + sum);
        return sum;
    }

    public static void main(String[] args) {
        String key = "Naveen";
        System.out.println("HashCode for " + key + " is " + getHashCode(key));
    }
}
