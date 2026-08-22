import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            long[] arr = new long[a];
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextLong();
            }
 
            long gcd = 0;
            long lcm = 1;
 
            for (int i = a - 1; i >= 0; i--) {
                gcd = gcd(gcd, arr[i]);
                lcm = lcm(lcm, arr[i] / gcd); // use lcm function
            }
 
            System.out.println(lcm);
        }
    }
 
    // GCD of two numbers
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
 
    // LCM of two numbers
    static long lcm(long a, long b) {
        return a / gcd(a, b) * b; // divide first to avoid overflow
    }
}