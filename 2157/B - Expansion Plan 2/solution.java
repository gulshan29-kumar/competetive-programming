import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int t = in.nextInt();
        while (t-- > 0) {
 
            int a = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            String str = in.next();
 
            long cntf = 0, cnt8 = 0;
            for (char c : str.toCharArray()) {
                if (c == '4') cntf++;
                else cnt8++;
            }
 
            long p = x + y;
            long q = x - y;
 
            long ap = Math.abs(p);
            long aq = Math.abs(q);
 
            long dx = ap > cntf ? ap - cntf : 0;
            long dy = aq > cntf ? aq - cntf : 0;
 
            if (dx + dy <= 2L * cnt8) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}