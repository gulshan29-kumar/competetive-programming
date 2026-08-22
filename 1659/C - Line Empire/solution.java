import java.util.*;
import java.io.*;
 
public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long a = in.nextLong();
            long b = in.nextLong();
 
            // Include starting capital at 0
            long[] arr = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextLong();
            }
 
            // Suffix sum array
            long[] suffix = new long[n + 2];
            for (int i = n; i >= 1; i--) {
                suffix[i] = suffix[i + 1] + arr[i];
            }
 
            long ans = Long.MAX_VALUE;
 
            // Try every pivot
            for (int i = 0; i <= n; i++) {
                long xi = arr[i];
 
                // Cost to move capital to xi and conquer left side
                long leftCost = xi * (a + b);
 
                // Cost to conquer remaining from xi
                long numRight = n - i;
                long rightDistSum = suffix[i + 1] - numRight * xi;
                long rightCost = rightDistSum * b;
 
                ans = Math.min(ans, leftCost + rightCost);
            }
 
            System.out.println(ans);
        }
    }
}