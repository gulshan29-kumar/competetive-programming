import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int t = in.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
 
            int[][] casinos = new int[n][3];
            for (int i = 0; i < n; i++) {
                casinos[i][0] = in.nextInt(); // li
                casinos[i][1] = in.nextInt(); // ri
                casinos[i][2] = in.nextInt(); // reali
            }
 
            // Sort casinos by li ascending
            Arrays.sort(casinos, (a, b) -> Integer.compare(a[0], b[0]));
 
            boolean changed = true;
            while (changed) {
                changed = false;
                for (int i = 0; i < n; i++) {
                    int l = casinos[i][0], r = casinos[i][1], real = casinos[i][2];
                    if (l <= k && k <= r) {
                        if (real > k) {
                            k = real;
                            changed = true;
                        }
                        // Mark as visited by setting l > r (out of range)
                        casinos[i][0] = Integer.MAX_VALUE;
                    }
                }
            }
 
            System.out.println(k);
        }
 
        in.close();
    }
}