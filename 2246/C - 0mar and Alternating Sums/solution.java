import java.util.*;
 
public class Main
{
    static final long MOD=1000000007;
 
    static long power(long a,long b)
    {
        long ans=1;
        while(b>0)
        {
            if((b&1)==1)
                ans=ans*a%MOD;
            a=a*a%MOD;
            b>>=1;
        }
        return ans;
    }
 
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
 
        while(t-->0)
        {
            int n=in.nextInt();
            int m=0,d=0,p=0;
            int prev=-1000000000;
 
            for(int i=0;i<n;i++)
            {
                int x=in.nextInt();
 
                if(x==-1)
                    m++;
                else if(x!=prev)
                {
                    d++;
 
                    if(prev!=-1000000000&&x==prev+1)
                        p++;
 
                    prev=x;
                }
            }
 
            if(m==0)
                System.out.println(power(2,n-d));
            else
                System.out.println(power(2,n-d-1)*(p+1)%MOD);
        }
    }
}