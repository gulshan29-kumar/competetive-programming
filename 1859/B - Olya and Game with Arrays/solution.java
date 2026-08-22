import java.util.*;
import java.io.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int total = a;
            ArrayList<List<Long>> arr = new ArrayList<>();
            long ans = 0;
 
            while (a-- > 0) {
                int n = in.nextInt();
                long min = Long.MAX_VALUE;
                long smin = Long.MAX_VALUE;
 
                for (int i = 0; i < n; i++) {
                    long c = in.nextLong();
                    if (c < min) {
                        smin = min;
                        min = c;
                    } else if (c < smin) {
                        smin = c;
                    }
                }
 
                List<Long> temp = new ArrayList<>();
                temp.add(smin);
                temp.add(min);
                ans += smin;
                arr.add(temp);
            }
 
            // Sort based on smin
            Collections.sort(arr, (x, y) -> Long.compare(x.get(0), y.get(0)));
 
            ans = ans - arr.get(0).get(0);
 
            long min1 = Long.MAX_VALUE;
            for (int i = 0; i < total; i++) {
                min1 = Math.min(min1, arr.get(i).get(1));
            }
 
            System.out.println(ans + min1);
        }
    }
}