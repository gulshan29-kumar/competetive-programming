import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = 2 * n;
 
            int[] first = new int[n + 1];
            int[] left = new int[m + 1];
 
            for (int i = 1; i <= m; i++) {
                int x = sc.nextInt();
 
                if (first[x] == 0)
                    first[x] = i;
                else
                    left[i] = first[x];
            }
 
            long[] dp = new long[m + 1];
 
            for (int i = 1; i <= m; i++) {
                dp[i] = dp[i - 1];
 
                if (left[i] != 0) {
                    long len = i - left[i] + 1;
                    long gain = len * len - len;
                    dp[i] = Math.max(dp[i], dp[left[i] - 1] + gain);
                }
            }
 
            System.out.println(2L * n + dp[m]);
        }
    }
}