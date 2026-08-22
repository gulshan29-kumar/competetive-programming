import java.util.*;
 
public class god{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();
            int ans1= 1;
            int ans2=1;
 
            long maxr = Math.max(c, a - c+1);
            long maxcl = Math.max(d, b - d +1);
 
                ans1+= ceilLog2(a - maxr + 1) + ceilLog2(b);
 
                ans2 += ceilLog2(b - maxcl + 1) + ceilLog2(a);
 
            System.out.println(Math.min(ans1,ans2));
        }
    }
 
    static int ceilLog2(long x) {
        if (x <= 1) return 0;
        int log = (int)(Math.log(x) / Math.log(2));
        if ((1L << log) < x) log++;
        return log;
    }
}
 