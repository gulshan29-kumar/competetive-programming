import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     while(t-->0){
       int a=in.nextInt();
       int arr[]=new int[a];
       for(int i=0;i<a;i++) arr[i]=in.nextInt();
       int prev=arr[0];
       int count=0;
       for(int i=0;i<a;i++){
           if(arr[i]==prev) count++;
           else{
               if(count==1) {
                   count=-1;
                   break;
               }
               prev=arr[i];
               count=1;
           }
       }
         if(count==1) {
             count=-1;}
       if(count==-1) {
           System.out.println(-1);continue;
       }
       prev=1;
       for(int i=0;i<a-1;i++){
           if(arr[i]==arr[i+1]) System.out.print((i+1+1)+" ");
           else {
               System.out.print(prev+" ");
               prev=i+2;
           }
       }
         System.out.print(prev+" ");
         System.out.println();
     }
    }
}