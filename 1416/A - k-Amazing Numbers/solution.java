import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    // FastReader class to handle quick input
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
 
    public static void main(String[] args) throws java.lang.Exception {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out); // Faster than System.out.println
        
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int arr[] = new int[a];
            int ans[] = new int[a];
            Arrays.fill(ans, Integer.MAX_VALUE);
            
            for (int i = 0; i < a; i++) arr[i] = in.nextInt();
            
            Map<Integer, List<Integer>> map = new TreeMap<>();
            for (int i = 0; i < a; i++) {
                if (!map.containsKey(arr[i])) {
                    map.put(arr[i], new ArrayList<>());
                }
                map.get(arr[i]).add(i);
            }
 
            for (int it : map.keySet()) {
                List<Integer> list = map.get(it);
                // Initial gap from start to first occurrence
                int maxGap = list.get(0) + 1;
                // Gap from last occurrence to end
                maxGap = Math.max(maxGap, a - list.get(list.size() - 1));
                // Internal gaps between occurrences
                for (int i = 1; i < list.size(); i++) {
                    maxGap = Math.max(maxGap, list.get(i) - list.get(i - 1));
                }
                
                if (maxGap <= a) {
                    ans[maxGap - 1] = Math.min(it, ans[maxGap - 1]);
                }
            }
 
            int minVal = Integer.MAX_VALUE;
            for (int i = 0; i < a; i++) {
                minVal = Math.min(minVal, ans[i]);
                if (minVal == Integer.MAX_VALUE) {
                    out.print("-1 ");
                } else {
                    out.print(minVal + " ");
                }
            }
            out.println();
        }
        out.flush(); // Crucial: writes everything in the buffer to the console
        out.close();
    }
}