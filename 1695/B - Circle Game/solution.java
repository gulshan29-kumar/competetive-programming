import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
           int a=in.nextInt();
           int arr[]=new int[a];
           for(int i=0;i<a;i++) arr[i]=in.nextInt();
           if(a%2==1) {
               System.out.println("Mike");continue;
           }
           int idx=0;int idx1=1;
           for(int i=0;i<a;i++){
               if(i%2==0&&arr[idx]>arr[i]) idx=i;
               else if(i%2!=0&&arr[idx1]>arr[i]) idx1=i;
           }
 
               if(arr[idx]==arr[idx1]){
                   if(idx>idx1) System.out.println("Mike");
                   else System.out.println("Joe");
               }
               else if(arr[idx]>arr[idx1]) System.out.println("Mike");
               else System.out.println("Joe");
 
 
        }
    }
}