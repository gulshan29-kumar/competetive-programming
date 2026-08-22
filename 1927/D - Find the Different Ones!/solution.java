import java.util.*;
 
public class qwe {
    static void solve(Scanner in) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
 
        int[] p = new int[n];
        Arrays.fill(p, -1);
 
        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1];
            if (a[i] != a[i - 1]) {
                p[i] = i - 1;
            }
        }
 
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int l = in.nextInt() - 1;
            int r = in.nextInt() - 1;
 
            if (p[r] < l) {
                System.out.println("-1 -1");
            } else {
                System.out.println((p[r] + 1) + " " + (r + 1));
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        for (int i = 0; i < t; i++) {
            solve(in);
            if (i + 1 != t) {
                System.out.println();
            }
        }
    }
}