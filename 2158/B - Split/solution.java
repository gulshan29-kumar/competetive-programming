import java.io.*;
import java.util.*;
 
public class qwe{
 
    static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
 
        FastScanner(InputStream is) {
            in = is;
        }
 
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
 
        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) return -1;
            }
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = c - '0';
            while ((c = read()) > ' ') {
                val = val * 10 + (c - '0');
            }
            return val * sign;
        }
    }
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = fs.nextInt();
        while (t-- > 0) {
 
            int n = fs.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
 
            for (int i = 0; i < 2 * n; i++) {
                int x = fs.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
 
            int ev = 0, od = 0;
            for (int freq : map.values()) {
                if ((freq & 1) == 0) ev++;
                else od++;
            }
 
            int ans;
            if (od > 0) {
                ans = od + 2 * ev;
            } else {
                int val = Math.min(ev, n);
                if (((val ^ n) & 1) == 1) val--;
                ans = 2 * val;
            }
 
            out.write(String.valueOf(ans));
            out.newLine();
        }
 
        out.flush();
    }
}