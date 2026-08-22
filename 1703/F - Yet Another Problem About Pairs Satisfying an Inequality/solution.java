import java.util.*;
 
public class qwe {
    public static void solve(Scanner in) {
        int n = in.nextInt();
        int[] a = new int[n + 1]; // 1-based indexing
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
 
        long res = 0;
        ArrayList<Integer> v = new ArrayList<>();
 
        for (int i = 1; i <= n; i++) {
            if (a[i] >= i) continue;
 
            // Find the first index where a[i] could be inserted (lower_bound equivalent)
            int pos = Collections.binarySearch(v, a[i]);
            if (pos < 0) pos = -(pos + 1);
            res += pos;
 
            // Insert i into the sorted list
            int insertPos = Collections.binarySearch(v, i);
            if (insertPos < 0) insertPos = -(insertPos + 1);
            v.add(insertPos, i);
        }
 
        System.out.println(res);
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tt = in.nextInt(); // number of test cases
        for (int t = 0; t < tt; t++) {
            solve(in);
        }
        in.close();
    }
}