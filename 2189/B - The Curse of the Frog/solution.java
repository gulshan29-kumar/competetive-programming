import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int n = in.nextInt();
            long x = in.nextLong();
 
            long freeReach = 0;
            long bestGain = 0;
 
            for (int i = 0; i < n; i++) {
                long a = in.nextLong();
                long b = in.nextLong();
                long c = in.nextLong();
                freeReach+= (b - 1) * a;
 
                bestGain = Math.max(bestGain, b * a - c);
            }
 
            if (freeReach >= x) {
                System.out.println(0);
                continue;
            }
 
            if (bestGain <= 0) {
                System.out.println(-1);
                continue;
            }
 
            long remaining = x - freeReach;
            long ans = (remaining + bestGain - 1) / bestGain;
            System.out.println(ans);
        }
    }
}