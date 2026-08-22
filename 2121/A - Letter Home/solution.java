import java.util.*;
 
public class  god {
    public static void main(String[] args) {
 
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     while(t-->0){
         int a=in.nextInt();
         int b=in.nextInt();
         int min= Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;
         for(int i=0;i<a;i++ ){
             int c=in.nextInt();
             min=Math.min(min,c);
             max=Math.max(max,c);
         }
         if(min==max) System.out.println(Math.abs(b-min));
         else if(b<=min) System.out.println(max-b);
         else if(b>=max) System.out.println(b-min);
         else System.out.println(2*Math.min(Math.abs(b-min),Math.abs(b-max))+Math.max(Math.abs(b-min),Math.abs(b-max)));
     }
 
    }
}