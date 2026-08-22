import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
         int a=in.nextInt();
         int k=in.nextInt();
         long arr[]=new long[a];
         long sum=0;
         for(int i=0;i<a;i++) {
             arr[i]=in.nextLong();
             sum+=arr[i];
         }
         Arrays.sort(arr);
         long prefix[]=new long[2*k];
         for(int i=0;i<2*k;i++){
             if(i>0) prefix[i]=arr[i]+prefix[i-1];
             else prefix[i]=arr[i];
         }
         long suffix[]=new long[k];
         for(int i=0;i<k;i++){
             if(i>0) suffix[i]=arr[a-i-1]+suffix[i-1];
             else suffix[i]=arr[a-i-1];
         }
         long ans=Long.MAX_VALUE;
         int i=2*k-1;int j=0;
         while(i>0){
             if(i==2*k-1) {
                 ans=Math.min(ans,prefix[i]);i-=2;
             }
             else {
                 ans=Math.min(ans,prefix[i]+suffix[j]);
                 i-=2;j++;
             }
         }
         ans=Math.min(ans,suffix[suffix.length-1]);
 
           System.out.println(sum-ans);
       }
    }
}