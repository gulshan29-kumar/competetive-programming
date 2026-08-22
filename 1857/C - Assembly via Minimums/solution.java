import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int n = in.nextInt();
            int m = n * (n - 1) / 2;
            long[] b = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = in.nextLong();
            }
 
            Arrays.sort(b);
 
            long[] a = new long[n];
            int idx = 0;
            int step = n - 1;
            for (int i = 0; i < n - 1; i++) {
                a[i] = b[idx];
                idx += step;
                step--;
            }
            a[n - 1] = 1000000000L;  // large value for the last element
 
            for (int i = 0; i < n; i++) {
                if (i > 0) out.append(" ");
                out.append(a[i]);
            }
            out.append("
");
        }
 
        System.out.print(out.toString());
    }
}