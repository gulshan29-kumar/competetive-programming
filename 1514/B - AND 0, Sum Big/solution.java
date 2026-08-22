import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        long mod=1000000007;
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            long ans=1;
            for(int i=0;i<b;i++){
                ans=(ans*a)%mod;
            }
            System.out.println(ans);
        }
    }
}