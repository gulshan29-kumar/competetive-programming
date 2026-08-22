import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int n = in.nextInt();
 
            int[] p = new int[n];
            int[] a = new int[n];
            int[] pos = new int[n + 1];
 
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
                pos[p[i]] = i;
            }
 
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
 
            boolean possible = true;
 
            for (int i = 0; i < n - 1; i++) {
                if (a[i] != a[i + 1]) {
                    if (pos[a[i]] > pos[a[i + 1]]) {
                        possible = false;
                        break;
                    }
                }
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
    }
}