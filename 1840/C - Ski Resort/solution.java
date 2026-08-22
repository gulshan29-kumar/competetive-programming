import java.util.*;
import java.io.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int k=in.nextInt();
            long q=in.nextLong();
            long arr[]=new long[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextLong();
            }
            long ans=0;
            long ans1=0;
            long fact=0;
            for(int i=0;i<a;i++){
                if(arr[i]<=q) ans++;
                else{
                    if(ans>=k){
                        long diff=ans-k+1;
                        ans1+=diff*(diff+1)/2;
                        fact++;
                    }
                    ans=0;
 
                }
            }
            if(ans>=k) {
                long diff=ans-k+1;
                ans1+=diff*(diff+1)/2;
                fact++;
            }
            System.out.println(ans1);
 
        }
    }
}