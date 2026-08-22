import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int a = Integer.parseInt(br.readLine());
            long[] arr = new long[a];
            String[] parts = br.readLine().split(" ");
            for(int i = 0; i < a; i++) arr[i] = Long.parseLong(parts[i]);
 
            int[][] dp = new int[31][a + 1];
            for(int i = 0; i <= 30; i++){
                dp[i][0] = 0;
                for(int j = 1; j <= a; j++){
                    if((arr[j - 1] & (1L << i)) == 0)
                        dp[i][j] = dp[i][j - 1] + 1;
                    else
                        dp[i][j] = dp[i][j - 1];
                }
            }
 
            int q = Integer.parseInt(br.readLine());
            for(int qi = 0; qi < q; qi++){
                String[] query = br.readLine().split(" ");
                int d = Integer.parseInt(query[0]);
                long e = Long.parseLong(query[1]);
 
                if(e > arr[d - 1]) {
                    out.print(-1 + " ");
                    continue;
                }
 
                int ans = d - 1;
                int left = d - 1;
                int right = a - 1;
 
                while(left <= right){
                    int mid = (left + right) / 2;
                    if(inrange(dp, d - 1, mid) >= e){
                        ans = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
 
                out.print(ans + 1 + " ");
            }
            out.println();
        }
 
        out.flush();
        out.close();
    }
 
    static long inrange(int[][] dp, int start, int mid){
        long ans = 0;
        for(int i = 0; i <= 30; i++){
            if(dp[i][mid + 1] - dp[i][start] == 0)
                ans |= (1L << i);
        }
        return ans;
    }
}