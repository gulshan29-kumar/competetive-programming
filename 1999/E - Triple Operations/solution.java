import java.io.*;
import java.util.*;
 
public class Codechef {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
 
            long ans = 0;
 
            // handle l separately (as per your logic)
            int temp = l, cnt = 0;
            while (temp > 0) { temp /= 3; cnt++; }
            ans += 2L * cnt;
 
            l++; // remaining range
 
            long start = 1;
            int digits = 1;
 
            while (start <= r) {
                long end = start * 3 - 1;
 
                long left = Math.max(l, start);
                long right = Math.min(r, end);
 
                if (left <= right) {
                    ans += (right - left + 1) * digits;
                }
 
                start *= 3;
                digits++;
            }
 
            sb.append(ans).append("
");
        }
 
        System.out.print(sb);
    }
}