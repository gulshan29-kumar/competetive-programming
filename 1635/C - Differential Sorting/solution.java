import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int a=in.nextInt();
           long arr[]=new long[a];
           for(int i=0;i<a;i++) arr[i]=in.nextLong();
           if(arr[a-2]>arr[a-1]) {
               System.out.println(-1);
               continue;
           }
           if(arr[a-1]<0){
               int bool=0;
               for(int i=0;i<a-1;i++){
                   if(arr[i]>arr[i+1]){
                       bool=1;
                       break;
                   }
               }
               if(bool==1) System.out.println(-1);
               else System.out.println(0);
               continue;
           }
            System.out.println(a-2);
           for(int i=0;i<a-2;i++){
               System.out.println((i+1) + " " + (a-1) + " " + a);
           }
        }
    }
}