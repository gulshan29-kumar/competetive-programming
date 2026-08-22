import java.io.*;
import java.util.*;
 
public class Main {
 
    static int parent[];
    static int size[];
 
    // -------- FAST SCANNER ----------
    static class FastScanner {
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
                val = val * 10 + c - '0';
            }
 
            return val * sign;
        }
    }
 
    public static void main(String[] args) throws Exception {
 
        FastScanner in = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
 
        int n = in.nextInt();
        int m = in.nextInt();
 
        parent = new int[n];
        size = new int[n];
 
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
 
        for (int i = 0; i < m; i++) {
            int k = in.nextInt();
 
            if (k > 0) {
                int first = in.nextInt() - 1;
 
                for (int j = 1; j < k; j++) {
                    int c = in.nextInt() - 1;
                    union(first, c);
                }
            }
        }
 
        for (int i = 0; i < n; i++) {
            out.append(size[find(i)]).append(" ");
        }
 
        System.out.println(out);
    }
 
    static void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
 
        if (pa != pb) {
            if (pa > pb) {
                parent[pb] = pa;
                size[pa] += size[pb];
            } else {
                parent[pa] = pb;
                size[pb] += size[pa];
            }
        }
    }
 
    static int find(int a) {
        if (parent[a] != a) {
            parent[a] = find(parent[a]); // path compression
        }
        return parent[a];
    }
}