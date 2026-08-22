import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    while(t-->0) {
        long a=in.nextLong();
        long b=in.nextLong();
        if(b>a) {
            System.out.println(1);
            continue;
        }
        long ans=Long.MAX_VALUE;
        long step=0;
        while (step < 60) {
            if (b != 1) {
                long temp = a;
                long ops = 0;
                while (temp > 0) {
                    temp /= b;
                    ops++;
                }
                ans = Math.min(ans, ops  + step);
            } else {
                ans = Math.min(ans, a + 1);
            }
            b++;
            step++;
        }
 
        System.out.println(ans);
 
 
       }
    }
}