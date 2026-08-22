import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     while(t-->0){
         int a=in.nextInt();
         int k=in.nextInt();
       String str=in.next();
       int black=0;
       int white=0;
       int ans=k;
       for(int i=0;i<a;i++){
           if(str.charAt(i)=='B') black++;
           else white++;
           if(black+white>k){
               if(str.charAt(i-k)=='B') black--;
               else white--;
           }
           if(black+white==k){
               ans=Math.min(ans,white);
           }
       }
         System.out.println(ans);
     }
    }
}