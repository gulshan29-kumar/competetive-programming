import java.io.*;
import java.util.*;
 
public class god {
 
    private static void solve(StringTokenizer st, BufferedReader br, StringBuilder sb) throws Exception {
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
 
        long[] x = new long[n + 1];
        long[] y = new long[n + 1];
 
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Long.parseLong(st.nextToken());
            y[i] = Long.parseLong(st.nextToken());
        }
 
        long ans = Math.abs(x[s] - x[t]) + Math.abs(y[s] - y[t]);
 
        long mins = Long.MAX_VALUE, mint = Long.MAX_VALUE;
 
        for (int i = 1; i <= k; i++) {
            long d1 = Math.abs(x[s] - x[i]) + Math.abs(y[s] - y[i]);
            long d2 = Math.abs(x[t] - x[i]) + Math.abs(y[t] - y[i]);
            if (d1 < mins) mins = d1;
            if (d2 < mint) mint = d2;
        }
 
        if (mins != Long.MAX_VALUE && mint != Long.MAX_VALUE)
            ans = Math.min(ans, mins + mint);
 
        sb.append(ans).append('
');
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            solve(st, br, sb);
        }
 
        System.out.print(sb);
    }
}