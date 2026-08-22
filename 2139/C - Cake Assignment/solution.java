import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
 
        int T = fs.nextInt();
        while (T-- > 0) {
            int k = fs.nextInt();
            long x = fs.nextLong();
 
            long half  = 1L << k;         // 2^k
            long total = 1L << (k + 1);   // 2^{k+1}
            long a = x;
            long b = total - x;
 
            ArrayList<Integer> rev = new ArrayList<>();
 
            // reverse-greedy until we reach (2^k, 2^k)
            while (a != half) {
                if (a < b) {
                    // reverse of op1: (a,b) <- (2a, b-a)
                    rev.add(1);
                    b -= a;
                    a <<= 1;
                } else {
                    // reverse of op2: (a,b) <- (a-b, 2b)
                    rev.add(2);
                    a -= b;
                    b <<= 1;
                }
                // safety guard (should never trigger with valid constraints)
                if (rev.size() > 200) break;
            }
 
            Collections.reverse(rev);
            out.append(rev.size()).append('
');
            if (rev.isEmpty()) {
                out.append('
');
            } else {
                for (int i = 0; i < rev.size(); ++i) {
                    if (i > 0) out.append(' ');
                    out.append(rev.get(i));
                }
                out.append('
');
            }
        }
        System.out.print(out.toString());
    }
 
    // Minimal fast scanner
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
 
        FastScanner(InputStream is) { in = is; }
 
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
 
        long nextLong() throws IOException {
            int c;
            while ((c = read()) <= ' ' && c != -1) {}
            int sign = 1;
            if (c == '-') { sign = -1; c = read(); }
            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
 
        int nextInt() throws IOException { return (int) nextLong(); }
    }
}