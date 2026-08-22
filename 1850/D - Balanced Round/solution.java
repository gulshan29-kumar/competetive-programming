import java.util.*;
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int ans=0;
            int renew=1;
            long arr[]=new long[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextLong();
            }
            Arrays.sort(arr);
            if(a==1) System.out.println(0);
            else{
                for(int i=0;i<a-1;i++){
                    if(arr[i+1]-arr[i]<=b) renew++;
                    else{
                        ans=Math.max(ans,renew);
                        renew=1;
                    }
                }
                ans=Math.max(ans,renew);
                System.out.println(a-ans);
            }
        }
    }
}