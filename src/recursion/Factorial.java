package recursion;

public class Factorial {
    //Approach 1
    public static long fact(long n) {
        if(n==0){
            return 1;
        }
            return n * fact(n-1);
    }

    //Approach 2
    public static long fact2(long n){
        long result = 1;
        while(n!=0){
            result*=n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        long n=15;
        System.out.println(fact(n));
        System.out.println(fact2(n));
    }
}
