import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
           String str=in.next();
           int mod= 998244353;
           long ans=1;
           long count=1;
           long maxlength=1;
           for(int i=1;i<str.length();i++){
             if(str.charAt(i)!=str.charAt(i-1))  {
                 maxlength++;
                 ans=(ans*count)%mod;
                 count=1;
             }
             else count++;
           }
           ans=(ans*count)%mod;
           for(int i=1;i<=str.length()-maxlength;i++){
               ans=(ans*i)%mod;
           }
           System.out.println((str.length()-maxlength)+" "+ans);
 
       }
    }
}