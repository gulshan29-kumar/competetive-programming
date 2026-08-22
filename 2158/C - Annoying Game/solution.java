import java.util.*;
 
public class qwe {
 
    static long kadane(long[] a) {
        long best = Long.MIN_VALUE, curr = 0;
        for (long x : a) {
            curr = Math.max(x, curr + x);
            best = Math.max(best, curr);
        }
        return best;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int t = in.nextInt();
        while (t-- > 0) {
 
            int n = in.nextInt();
            long k = in.nextLong();
 
            long[] a = new long[n];
            long[] b = new long[n];
 
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            for (int i = 0; i < n; i++) b[i] = in.nextLong();
 
            long base = kadane(a);
 
            if (k % 2 == 0) {
                System.out.println(base);
                continue;
            }
 
            long[] left = new long[n];
            long[] right = new long[n];
 
            long curr = 0;
            for (int i = 0; i < n; i++) {
                curr = Math.max(a[i], curr + a[i]);
                left[i] = curr - a[i];
            }
 
            curr = 0;
            for (int i = n - 1; i >= 0; i--) {
                curr = Math.max(a[i], curr + a[i]);
                right[i] = curr - a[i];
            }
 
            long ans = base;
 
            for (int i = 0; i < n; i++) {
                long val = left[i] + (a[i] + b[i]) + right[i];
                ans = Math.max(ans, val);
            }
 
            System.out.println(ans);
        }
    }
}