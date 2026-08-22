import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
 
    static void solve(FastReader sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] strips = new String[k];
        for (int i = 0; i < k; i++) {
            strips[i] = sc.next();
        }
 
        int[] masks = new int[n];
        for (int j = 0; j < n; j++) {
            int mask = 0;
            for (int i = 0; i < k; i++) {
                mask |= (1 << (strips[i].charAt(j) - 'a'));
            }
            masks[j] = mask;
        }
 
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i * i != n) divisors.add(n / i);
            }
        }
        Collections.sort(divisors);
 
        for (int d : divisors) {
            char[] prefix = new char[d];
            boolean possible = true;
 
            for (int i = 0; i < d; i++) {
                int common = (1 << 26) - 1;
                for (int j = i; j < n; j += d) {
                    common &= masks[j];
                    if (common == 0) break;
                }
 
                if (common == 0) {
                    possible = false;
                    break;
                } else {
                    for (int bit = 0; bit < 26; bit++) {
                        if ((common & (1 << bit)) != 0) {
                            prefix[i] = (char) ('a' + bit);
                            break;
                        }
                    }
                }
            }
 
            if (possible) {
                StringBuilder sb = new StringBuilder();
                String pStr = new String(prefix);
                for (int i = 0; i < n / d; i++) {
                    sb.append(pStr);
                }
                System.out.println(sb.toString());
                return;
            }
        }
    }
 
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}