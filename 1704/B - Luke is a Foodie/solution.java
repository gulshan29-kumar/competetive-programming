import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     while(t-->0) {
         int a=in.nextInt();
         long b=in.nextLong();
         long arr[]=new long[a];
         for(int i=0;i<a;i++){
             arr[i]=in.nextLong();
         }
         long range[][]=new long[a][2];
         for(int i=0;i<a;i++){
             range[i][0]=Math.abs(arr[i]-b);
             range[i][1]=Math.abs(arr[i]+b);
         }
         long minrange=range[0][0];
         long maxrange=range[0][1];
         int ans=0;
         for(int i=1;i<a;i++){
             minrange=Math.max(minrange,range[i][0]);
             maxrange=Math.min(maxrange,range[i][1]);
             if(minrange>maxrange){
                 ans++;
                 minrange=range[i][0];
                 maxrange=range[i][1];
             }
         }
         System.out.println(ans);
     }
    }
}