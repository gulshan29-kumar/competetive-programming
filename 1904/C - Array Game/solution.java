import java.io.*;
import java.util.*;
 
public class qwe {
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream is) { this.in = is; }
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
            do { c = read(); } while (c <= ' '); // skip whitespace
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
 
    static int lowerBound(long[] a, long key) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (a[m] < key) l = m + 1;
            else r = m;
        }
        return l;
    }
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = fs.nextLong();
 
            if (k >= 3) { // after 3+ operations, we can force a zero
                out.append(0).append('
');
                continue;
            }
 
            int m = n * (n - 1) / 2; // number of pairwise differences
            long[] diffs = new long[m];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    diffs[idx++] = Math.abs(a[i] - a[j]); // all |ai - aj|
                }
            }
            Arrays.sort(diffs); // sort once to enable binary searches
 
            long ans = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) ans = Math.min(ans, a[i]); // current min without operations
            ans = Math.min(ans, diffs[0]); // best after one operation
 
            if (k == 2) {
                for (int i = 0; i < n; i++) {
                    long val = a[i];
                    int at = lowerBound(diffs, val); // first d >= ai
                    if (at < m) ans = Math.min(ans, Math.abs(diffs[at] - val));
                    if (at - 1 >= 0) ans = Math.min(ans, Math.abs(diffs[at - 1] - val)); // closest d < ai
                }
            }
 
            out.append(ans).append('
');
        }
        System.out.print(out.toString());
    }
}
 
/*
Time Complexity (TC): O(n^2 log n)
Space Complexity (SC): O(n^2)
*/