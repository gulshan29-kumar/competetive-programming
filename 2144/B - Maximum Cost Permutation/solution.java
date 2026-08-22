import java.util.*;
public class  qwe{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int n = in.nextInt();
            int[] p = new int[n];
            HashSet<Integer> present = new HashSet<>();
            int zeroCount = 0;
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
                if (p[i] > 0) present.add(p[i]);
                if (p[i] == 0) zeroCount++;
            }
 
            // collect missing numbers
            int onlyMissing = -1;
            if (zeroCount == 1) {
                for (int i = 1; i <= n; i++) {
                    if (!present.contains(i)) {
                        onlyMissing = i;
                        break;
                    }
                }
            }
 
            // function: can position i (1-based) be mismatch?
            boolean[] canMismatch = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (p[i] == 0) {
                    if (!(zeroCount == 1 && onlyMissing == i + 1)) {
                        canMismatch[i] = true;
                    }
                } else if (p[i] != i + 1) {
                    canMismatch[i] = true;
                }
            }
 
            int L = -1, R = -1;
            for (int i = 0; i < n; i++) {
                if (canMismatch[i]) {
                    L = i;
                    break;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (canMismatch[i]) {
                    R = i;
                    break;
                }
            }
 
            if (L == -1) out.append(0).append("
");
            else out.append(R - L + 1).append("
");
        }
 
        System.out.print(out.toString());
    }
}