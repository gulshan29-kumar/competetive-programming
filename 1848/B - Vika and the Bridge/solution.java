import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
            }
 
            int[] last = new int[k];
            Arrays.fill(last, -1);
 
            int[] maxStep = new int[k];
            int[] max2Step = new int[k];
 
            for (int i = 0; i < n; i++) {
                int color = c[i] - 1; // adjust for 0-based index
                int step = i - last[color];
                if (step > maxStep[color]) {
                    max2Step[color] = maxStep[color];
                    maxStep[color] = step;
                } else if (step > max2Step[color]) {
                    max2Step[color] = step;
                }
                last[color] = i;
            }
 
            for (int i = 0; i < k; i++) {
                int step = n - last[i];
                if (step > maxStep[i]) {
                    max2Step[i] = maxStep[i];
                    maxStep[i] = step;
                } else if (step > max2Step[i]) {
                    max2Step[i] = step;
                }
            }
 
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < k; i++) {
                ans = Math.min(ans, Math.max((maxStep[i] + 1) / 2, max2Step[i]));
            }
            System.out.println(ans - 1);
        }
        in.close();
    }
}