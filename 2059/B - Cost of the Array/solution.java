import java.util.*;
 
public class question{
 
    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        k /= 2;
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        if (2 * k == n) {
            for (int i = 1; i < n; i += 2) {
                if (a[i] != (i + 1) / 2) {
                    System.out.println((i + 1) / 2);
                    return;
                }
            }
            System.out.println(k + 1);
        } else {
            for (int i = 1; i <= n - 2 * k + 1; i++) {
                if (a[i] != 1) {
                    System.out.println(1);
                    return;
                }
            }
            System.out.println(2);
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}