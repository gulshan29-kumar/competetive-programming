import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class god{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int dx = Integer.parseInt(st.nextToken());
                int dy = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                // Check for each corner (0,0), (0,s), (s,0), (s,s)
                boolean potted = false;
                // Corner (0,0)
                if ((0 - x) * dy == (0 - y) * dx) {
                    potted = true;
                }
                // Corner (0,s)
                if (!potted && (0 - x) * dy == (s - y) * dx) {
                    potted = true;
                }
                // Corner (s,0)
                if (!potted && (s - x) * dy == (0 - y) * dx) {
                    potted = true;
                }
                // Corner (s,s)
                if (!potted && (s - x) * dy == (s - y) * dx) {
                    potted = true;
                }
                if (potted) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}