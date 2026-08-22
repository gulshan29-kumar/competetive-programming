import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
           long arr1[]=new long[a];
           for(int i=0;i<a;i++){
               arr1[i]=in.nextLong();
           }
           long ans=0;
           if(a<=2){
               if(arr1[0]>arr1[1]) System.out.println(arr1[0]-arr1[1]);
               else System.out.println(0);
           }
           else{
 
               for(int i=1;i<a-1;i++){
                   if(i%2!=0){
                       if(arr1[i+1]+arr1[i-1]-arr1[i]>0) {
                           ans+=arr1[i+1]+arr1[i-1]-arr1[i];
                           arr1[i+1]=Math.max(0,-arr1[i-1]+arr1[i]);
                       }
                   }
               }
               if(a%2==0){
                   if(arr1[a-2]>=arr1[a-1]) ans+=arr1[a-2]-arr1[a-1];
               }
               System.out.println(ans);
           }
        }
 
    }
}