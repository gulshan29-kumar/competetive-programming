import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
           int a=in.nextInt();
           int b=in.nextInt();
           int arr1[]=new int[a];
           int arr2[]=new int[a];
           for(int i=0;i<a;i++) arr1[i]=in.nextInt();
           for(int i=0;i<a;i++) arr2[i]=in.nextInt();
           int max=0;
           int ans=0;
           int sum=0;
           for(int i=0;i<a;i++){
               sum+=arr1[i];
               max=Math.max(max,arr2[i]);
               if(i+1<=b){
                   ans=Math.max(ans,sum+(b-(i+1))*max);
               }
               else break;
           }
            System.out.println(ans);
 
        }
 
    }
}