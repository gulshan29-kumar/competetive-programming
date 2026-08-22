import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     int a=t;
     int b=t;
     int c=t;
     int ans=0;
     if(a%2==0) ans+=a/2;
     else {
         ans+=(a/2+1);
         b--;
     }
     if(b%2==0) {
         ans+=b/2;
         c-=b/2;
     }
     else{
         ans+=b/2+1;
         c-=b/2-2;
     }
     if(c%3==0){
         ans+=c/3;
     }
     else ans+=c/3+1;
     System.out.println(ans);
 
    }
}