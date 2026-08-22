import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
          int a=in.nextInt();
          long arr1[]=new long[a];
          long arr2[]=new long[a];
          for(int i=0;i<a;i++){
              arr1[i]=in.nextLong();
          }
          for(int i=0;i<a;i++) arr2[i]=in.nextLong();
          long diff[]=new long[a];
          for(int i=0;i<a;i++) diff[i]=arr2[i]-arr1[i];
          Arrays.sort(diff);
          int i=0;
          int j=a-1;
          int ans=0;
          while(i<j){
              if(diff[j]+diff[i]>=0) {
                  ans++;j--;i++;
              }
              else i++;
          }
            System.out.println(ans);
        }
    }
}
 