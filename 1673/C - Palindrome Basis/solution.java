import java.io.*;
import java.util.*;
 
public class Codechef {
    static final int MOD = (int)1e9 + 7;
    static final int MAX = 40000 + 5;
 
    // ✅ Palindrome check
    static boolean isPal(int n) {
        String s = Integer.toString(n);
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
 
    public static void main(String[] args) throws Exception {
        FastScanner in = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
 
        // ✅ Generate palindromes (clean + correct)
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < MAX; i++) {
            if(isPal(i)) list.add(i);
        }
 
        // ✅ 1D DP (unbounded knapsack)
        int[] dp = new int[MAX];
        dp[0] = 1;
 
        for(int coin : list) {
            for(int sum = coin; sum < MAX; sum++) {
                dp[sum] += dp[sum - coin];
                if(dp[sum] >= MOD) dp[sum] -= MOD;
            }
        }
 
        // ✅ Queries
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            out.append(dp[n]).append('
');
        }
 
        System.out.print(out);
    }
 
    // ✅ Fast I/O
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        FastScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
 
        String next() throws IOException {
            while(st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
 
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}