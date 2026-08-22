import java.util.*;
public class qwe {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      while(t-->0){
         long a=in.nextLong();
         long b=in.nextLong();
         int count=0;
         if(a==b) {
             System.out.println(0);
             continue;
         }
       if(a>b){
             while(b<a){
                 b*=2;
                 count++;
             }
         }
         else{
             while(a<b){
                 a*=2;
                 count++;
             }
         }
         if(a==b){
             int count8=count/3;
             count=count%3;
             if(count!=0) count8++;
             System.out.println(count8);
         }
         else System.out.println(-1);
 
      }
    }
}