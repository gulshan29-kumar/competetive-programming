import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     while(t-->0){
         int n=in.nextInt();
         long k=in.nextLong();
         long b=in.nextLong();
         long s=in.nextLong();
         long req=k*b+(k-1)*(n);
         if(req<s||s-k*b<0) System.out.println(-1);
         else{
             req=s-k*b;
             for(int i=0;i<n;i++){
                 if(i==0&&req>k-1) {
                     System.out.print((k*b+k-1)+" ");req=req-k+1;
                 }
                 else if(i==0){
                     System.out.print((k*b+req)+" ");req=0;
                 }
                 else if(req>k-1){
                     System.out.print((k-1)+" ");
                     req=req-k+1;
                 }
                 else{
                     System.out.print(req+" ");
                     req=0;
                 }
             }
             System.out.println();
         }
     }
    }
}