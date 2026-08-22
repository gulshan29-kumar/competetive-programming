import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
           long a=in.nextLong();
           long b=in.nextLong();
           long ans=4*((b-1)/4);
           if(b==0){
               System.out.println(a);
               continue;
           }
           if(a%2==0){
               long d=0;
               long e=2+ans;
               long count=0;
               while(d<(b-1)%4){
                   if(d<=1) count+=e;
                   else count-=e;
                   d++;e++;
               }
               System.out.println(a-ans+count-1);
           }
           else{
               long d=0;
               long e=2+ans;
               long count=0;
               while(d<(b-1)%4){
                   if(d<=1) count-=e;
                   else count+=e;
                   d++;e++;
               }
               System.out.println(a+ans+count+1);
           }
 
        }
    }
}