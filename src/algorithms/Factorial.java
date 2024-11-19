package algorithms;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact(4));
        System.out.println(fact(0));
        System.out.println(fact(-1));
    }

    // n! = n * n-1 * n-2 * .... n-n
    static int fact(int n) {
        if (n < 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
