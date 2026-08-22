import java.util.*;
 
public class question{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a=in.nextInt();
            long arr[]=new long[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
            int max=1;
            int ans=1;
            for(int i=1;i<a;i++){
                if(arr[i]==arr[i-1]) ans++;
                else {
                    max=Math.max(max,ans);
                    ans=1;
                }
            }
            max=Math.max(max,ans);
 
            if(max==a) System.out.println(0);
            else{
                ans=0;
               while(max<a){
                   int d=Math.min(a-max,max);
                   ans+=d+1;
                   max+=d;
               }
                System.out.println(ans);
            }
 
        }
    }
}