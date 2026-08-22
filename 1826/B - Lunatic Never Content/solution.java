import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
           int a=in.nextInt();
           long arr[]=new long[a];
           for(int i=0;i<a;i++) {
               arr[i]=in.nextLong();
           }
           long max=0;
 
           int i=0;int j=a-1;
           while(i<j){
               max=gcd(max,Math.abs(arr[i++]-arr[j--]));
           }
           System.out.println(max);
       }
    }
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
 
}