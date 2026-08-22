import java.util.*;
public class question{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
           long n=in.nextLong();
           long k=in.nextLong();
           long x=in.nextLong();
           long d=d=k*(k+1)/2;
           long e= e=k*(2*n+(k-1)*(-1))/2;
           if(n<k) System.out.println("NO");
           else{
               if(x>=d&&x<=e) System.out.println("Yes");
               else System.out.println("No");
           }
 
       }
    }
}