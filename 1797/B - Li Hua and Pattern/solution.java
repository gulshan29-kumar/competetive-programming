import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // for fast output
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
 
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(st.nextToken());
                }
            }
 
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans += (a[i][j] ^ a[n - i - 1][n - j - 1]);
                }
            }
 
            ans /= 2;
            if (ans <= k && (n % 2 == 1 || ans % 2 == k % 2)) {
                sb.append("YES
");
            } else {
                sb.append("NO
");
            }
        }
        System.out.print(sb);
    }
}