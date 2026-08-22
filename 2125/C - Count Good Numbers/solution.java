import java.util.*;
 
public class god {
    static long[] primes = {2, 3, 5, 7};
 
    // Count how many numbers from 1 to x are NOT divisible by 2, 3, 5, or 7
    static long countGood(long x) {
        long bad = 0;
 
        // Inclusion-Exclusion over all subsets of {2, 3, 5, 7}
        int n = primes.length;
        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            int bits = 0;
 
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;
                    lcm = lcm(lcm, primes[i]);
                    if (lcm > x) break; // no need to go further
                }
            }
 
            if (lcm > x) continue;
 
            long cnt = x / lcm;
            if (bits % 2 == 1) {
                bad += cnt;
            } else {
                bad -= cnt;
            }
        }
 
        return x - bad; // total good = total numbers - bad numbers
    }
 
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
 
    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            long l = in.nextLong();
            long r = in.nextLong();
 
            long ans = countGood(r) - countGood(l - 1);
            System.out.println(ans);
        }
    }
}