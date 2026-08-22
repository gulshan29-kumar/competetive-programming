import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long arr[]=new long[a];
            for(int i=0;i<a;i++) arr[i]=in.nextLong();
            long prefix[]=new long[a];
            prefix[0]=arr[0];
            for(int i=1;i<a;i++){
                prefix[i]=arr[i]+prefix[i-1];
            }
            long ans=0;
            for(int i=0;i<a-1;i++){
                ans=Math.max(ans,gcd(prefix[i],prefix[a-1]-prefix[i]));
            }
            System.out.println(ans);
        }
    }
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}