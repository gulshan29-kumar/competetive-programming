import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
          int a=in.nextInt();
          long arr[]=new long[a];
          for(int i=0;i<a;i++) arr[i]=in.nextLong();
          long gcd1=0;
          long gcd2=0;
          for(int i=0;i<a;i++){
              if(i%2==0) gcd1=gcd(gcd1,arr[i]);
              else gcd2=gcd(gcd2,arr[i]);
          }
          long bool1=0;
          long bool2=0;
          for(int i=0;i<a;i++){
              if(i%2!=0&&arr[i]%gcd1==0){
                  bool1=1;
              }
              if(i%2==0&&arr[i]%gcd2==0){
                  bool2=1;
              }
          }
          if(bool1==1&&bool2==1) System.out.println(0);
          else{
              if(bool1==0) System.out.println(gcd1);
              else System.out.println(gcd2);
          }
        }
    }
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}