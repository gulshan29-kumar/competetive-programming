import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
          Long a=in.nextLong();
          int b=in.nextInt();
          long arr[]=new long[b];
          for(int i=0;i<b;i++) arr[i]=in.nextLong();
          Arrays.sort(arr);
          long ans=0;
          long diff[]=new long[b];
          for(int i=1;i<b;i++){
              diff[i-1]=arr[i]-arr[i-1]-1;
          }
          diff[b-1]=a-arr[b-1]+arr[0]-1;
          Arrays.sort(diff);
          int days=0;
          for(int i=b-1;i>=0;i--){
              if(diff[i]-2*days>0){
                 ans++;
                 if(diff[i]-2*days-2>0) ans+=diff[i]-2*days-2;
                 days+=2;
              }
          }
            System.out.println(a-ans);
        }
    }
}
 