import java.io.*;
import java.util.*;
 
public class qwe {
    static long clamp(long v, long lo, long hi) {
        if (v < lo) return lo;
        if (v > hi) return hi;
        return v;
    }
 
    static boolean check(long n, long xk, long yk, long xd, long yd, long s) {
        long[] xs = new long[] {0, n, clamp(xk - s, 0, n), clamp(xk + s, 0, n)};
        long[] ys = new long[] {0, n, clamp(yk - s, 0, n), clamp(yk + s, 0, n)};
        ArrayList<long[]> cand = new ArrayList<>();
        for (long x : xs) {
            long rem = s - Math.abs(x - xk);
            if (rem < 0) continue;
            long y1 = yk + rem;
            long y2 = yk - rem;
            if (0 <= y1 && y1 <= n) cand.add(new long[]{x, y1});
            if (0 <= y2 && y2 <= n) cand.add(new long[]{x, y2});
        }
        for (long y : ys) {
            long rem = s - Math.abs(y - yk);
            if (rem < 0) continue;
            long x1 = xk + rem;
            long x2 = xk - rem;
            if (0 <= x1 && x1 <= n) cand.add(new long[]{x1, y});
            if (0 <= x2 && x2 <= n) cand.add(new long[]{x2, y});
        }
        cand.add(new long[]{0, 0});
        cand.add(new long[]{0, n});
        cand.add(new long[]{n, 0});
        cand.add(new long[]{n, n});
 
        for (long[] p : cand) {
            long px = p[0], py = p[1];
            long manh = Math.abs(px - xk) + Math.abs(py - yk);
            if (manh <= s) {
                long cheb = Math.max(Math.abs(px - xd), Math.abs(py - yd));
                if (cheb > s) return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            long n = fs.nextLong();
            long rK = fs.nextLong();
            long cK = fs.nextLong();
            long rD = fs.nextLong();
            long cD = fs.nextLong();
            long lo = 0, hi = 2 * n + 5;
            while (lo < hi) {
                long mid = (lo + hi) >>> 1;
                if (check(n, rK, cK, rD, cD, mid)) hi = mid;
                else lo = mid + 1;
            }
            sb.append(lo).append('
');
        }
        System.out.print(sb.toString());
    }
 
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
            while ((c = read()) <= ' ') { if (c == -1) return Long.MIN_VALUE; }
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