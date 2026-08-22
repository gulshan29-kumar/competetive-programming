import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a=in.nextLong();
            long b=in.nextLong();
            long ans=0;
            if(a%2==0&&b%2==0){
                ans+=a+b;
                ans=Math.max(a*(b/2)+2,ans);
                System.out.println(ans);
            }
            else if(a%2!=0&&b%2==0){
                if((a*(b/2)+2)%2==0) System.out.println(a*(b/2)+2);
                else System.out.println(-1);
            }
            else if(a%2!=0&&b%2!=0){
                System.out.println(a*b+1);
            }
            else System.out.println(-1);
        }
    }
}