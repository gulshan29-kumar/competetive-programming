import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
       
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
 
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int[] c = new int[n];
            int[] p = new int[n];
 
            for (int i = 0; i < n; i++) {
                c[i] = fr.nextInt();
                p[i] = fr.nextInt();
            }
 
            double dpNext = 0.0;
 
            
            for (int i = n - 1; i >= 0; i--) {
                double multiplier = 1.0 - (p[i] / 100.0);
                
              
                double takeTask = c[i] + (multiplier * dpNext);
                
                dpNext = Math.max(dpNext, takeTask);
            }
 
            out.printf("%.10f
", dpNext);
        }
        out.flush();
        out.close();
    }
 
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}