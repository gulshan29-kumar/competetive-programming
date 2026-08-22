import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
         long a=in.nextLong();
         if(a%2==1){
             System.out.println("Yes");
             continue;
         }
         while(a%2==0){
             a=a/2;
         }
         if(a%2==1&&a!=1) System.out.println("Yes");
         else System.out.println("No");
       }
    }
 
}