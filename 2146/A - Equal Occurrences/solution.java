import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
           int a=in.nextInt();
           int arr[]=new int[a+1];
           for(int i=1;i<=a;i++){
               int d=in.nextInt();
               arr[d]++;
           }
           Arrays.sort(arr);
           int ans=0;
           for(int i=a;i>=0;i--){
               ans=Math.max(ans,arr[i]*(a-i+1));
           }
           System.out.println(ans);
 
 
 
       }
    }
}