import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt(), m = fs.nextInt();
 
            List<int[]> sets = new ArrayList<>();
            List<List<Integer>> occ = new ArrayList<>(m + 1);
            for (int i = 0; i <= m; i++) occ.add(new ArrayList<>());
 
            for (int i = 0; i < n; i++) {
                int li = fs.nextInt();
                int[] arr = new int[li];
                for (int j = 0; j < li; j++) {
                    arr[j] = fs.nextInt();
                    occ.get(arr[j]).add(i);
                }
                sets.add(arr);
            }
 
            // check missing elements
            boolean impossible = false;
            for (int x = 1; x <= m; x++) {
                if (occ.get(x).isEmpty()) {
                    impossible = true;
                    break;
                }
            }
            if (impossible) {
                out.append("NO
");
                continue;
            }
 
            int[] cnt = new int[m + 1];
            for (int x = 1; x <= m; x++) cnt[x] = occ.get(x).size();
 
            boolean[] covered = new boolean[m + 1];
            boolean[] selected = new boolean[n];
            ArrayDeque<Integer> q = new ArrayDeque<>();
            for (int x = 1; x <= m; x++) if (cnt[x] == 1) q.add(x);
 
            while (!q.isEmpty()) {
                int x = q.poll();
                if (covered[x] || cnt[x] != 1) continue;
 
                int s = -1;
                for (int idx : occ.get(x)) if (!selected[idx]) {
                    s = idx;
                    break;
                }
                if (s == -1) continue;
 
                selected[s] = true;
                for (int y : sets.get(s)) {
                    if (!covered[y]) covered[y] = true;
                    cnt[y]--;
                    if (!covered[y] && cnt[y] == 1) q.add(y);
                }
            }
 
            boolean ok = true;
            for (int x = 1; x <= m; x++) {
                if (!covered[x] && cnt[x] == 0) {
                    ok = false;
                    break;
                }
            }
            if (!ok) {
                out.append("NO
");
                continue;
            }
 
            int alive = 0;
            for (int i = 0; i < n; i++) if (!selected[i]) alive++;
 
            out.append(alive >= 2 ? "YES
" : "NO
");
        }
        System.out.print(out);
    }
 
    // FastScanner for speed
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
    }
}