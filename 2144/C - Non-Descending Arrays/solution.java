import java.util.*;
import java.io.*;
 
public class qwe {
    static final int MOD = 998244353;
 
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
 
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            for (int i = 0; i < n; i++) b[i] = in.nextInt();
 
            long dp0 = 1; // ways ending at i with no swap
            long dp1 = 1; // ways ending at i with swap
 
            for (int i = 0; i < n - 1; i++) {
                long nd0 = 0, nd1 = 0;
 
                // current values
                int Ai0 = a[i], Bi0 = b[i]; // if i not swapped
                int Ai1 = b[i], Bi1 = a[i]; // if i swapped
 
                // next values
                int Aj0 = a[i + 1], Bj0 = b[i + 1]; // next not swapped
                int Aj1 = b[i + 1], Bj1 = a[i + 1]; // next swapped
 
                // transitions from dp0
                if (Ai0 <= Aj0 && Bi0 <= Bj0) nd0 = (nd0 + dp0) % MOD;
                if (Ai0 <= Aj1 && Bi0 <= Bj1) nd1 = (nd1 + dp0) % MOD;
 
                // transitions from dp1
                if (Ai1 <= Aj0 && Bi1 <= Bj0) nd0 = (nd0 + dp1) % MOD;
                if (Ai1 <= Aj1 && Bi1 <= Bj1) nd1 = (nd1 + dp1) % MOD;
 
                dp0 = nd0;
                dp1 = nd1;
            }
 
            long ans = (dp0 + dp1) % MOD;
            out.append(ans).append("
");
        }
 
        System.out.print(out);
    }
 
    // Fast input class
    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in;
        FastScanner(InputStream in) { this.in = in; }
 
        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
 
        int nextInt() throws IOException {
            int c, sign = 1, val = 0;
            do { c = readByte(); } while (c <= ' ');
            if (c == '-') { sign = -1; c = readByte(); }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }
    }
}