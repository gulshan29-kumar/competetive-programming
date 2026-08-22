import java.util.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a=in.nextLong();
            long b=in.nextLong();
            long c=in.nextLong();
            long ans=a/b;
            long ans2=a/c;
            long common=a/lcm(b,c);  // common multiples of both b and c
            ans-=common;
            ans2-=common;
            System.out.println((ans*(2*(a-ans+1)+(ans-1))/2)-(ans2*(ans2+1)/2));
        }
    }
 
    static long gcd(long a ,long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
 
    static long lcm(long a, long b) {
        return (a / gcd(a,b)) * b;
    }
}