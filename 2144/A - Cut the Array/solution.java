import java.util.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = in.nextInt();
            int[] pref = new int[n + 1];
            for (int i = 0; i < n; i++) pref[i + 1] = pref[i] + arr[i];
            boolean ok = false;
            for (int l = 1; l < n - 1 && !ok; l++) {
                for (int r = l + 1; r < n; r++) {
                    int s1 = pref[l] % 3;
                    int s2 = (pref[r] - pref[l]) % 3;
                    int s3 = (pref[n] - pref[r]) % 3;
                    if ((s1 == s2 && s2 == s3) || (s1 != s2 && s1 != s3 && s2 != s3)) {
                        System.out.println(l + " " + r);
                        ok = true;
                        break;
                    }
                }
            }
            if (!ok) System.out.println("0 0");
        }
    }
}