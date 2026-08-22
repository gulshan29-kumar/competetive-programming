import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
 
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
 
        int cnt = 0;
 
        // First array
        for (int i = 0; i < n; i++) {
            int c = in.nextInt();
            if (c == 1) cnt++;
            else {
                if (cnt > 0) list1.add(cnt);
                cnt = 0;
            }
        }
        if (cnt > 0) list1.add(cnt);
 
        cnt = 0;
 
        // Second array
        for (int i = 0; i < m; i++) {
            int c = in.nextInt();
            if (c == 1) cnt++;
            else {
                if (cnt > 0) list2.add(cnt);
                cnt = 0;
            }
        }
        if (cnt > 0) list2.add(cnt);
 
        // Precompute divisor pairs
        List<int[]> divisors = new ArrayList<>();
        for (int d = 1; d * d <= k; d++) {
            if (k % d == 0) {
                divisors.add(new int[]{d, k / d});
                if (d != k / d) {
                    divisors.add(new int[]{k / d, d});
                }
            }
        }
 
        long ans = 0;
 
        // Process each divisor pair
        for (int[] div : divisors) {
            int x = div[0];
            int y = div[1];
 
            long count1 = 0;
            for (int len : list1) {
                if (len >= x) count1 += (len - x + 1);
            }
 
            long count2 = 0;
            for (int len : list2) {
                if (len >= y) count2 += (len - y + 1);
            }
 
            ans += count1 * count2;
        }
 
        System.out.println(ans);
    }
}