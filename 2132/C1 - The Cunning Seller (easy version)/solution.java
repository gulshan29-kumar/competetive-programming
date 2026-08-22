import java.util.*;
 
public class god {
    static long[] pow3 = new long[40];  // store powers of 3 up to 3^39 (safe for n ≤ 1e9)
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        // precompute powers of 3
        pow3[0] = 1;
        for (int i = 1; i < pow3.length; i++) pow3[i] = pow3[i - 1] * 3;
 
        while (t-- > 0) {
            long n = in.nextLong();
            System.out.println(minCost(n));
        }
    }
 
    static long minCost(long n) {
        long cost = 0;
        int idx = 0;
 
        // Convert n into base-3 digits
        while (n > 0) {
            int digit = (int)(n % 3);
            if (digit != 0) {
                cost += digit * dealCost(idx);
            }
            n /= 3;
            idx++;
        }
        return cost;
    }
 
    // cost of a deal for 3^x watermelons
    static long dealCost(int x) {
        if (x == 0) return 3; // special case: 1 watermelon = 3 coins
        return pow3[x + 1] + (long)x * pow3[x - 1];
    }
}