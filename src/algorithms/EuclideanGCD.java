package algorithms;

public class EuclidGCD {

    public static void main(String[] args) {
        int gcd = gcd(100, 120);
        System.out.println(gcd);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
