import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
           int a=in.nextInt();
           int arr[]=new int[a];
           long count2=0;
           for(int i=0;i<a;i++){
               arr[i]=in.nextInt();
               if(arr[i]==2) count2++;
           }
           if(count2%2!=0) System.out.println(-1);
           else if(count2==0) System.out.println(1);
           else{
            int count22=0;
            int ans=-1;
           for(int i=0;i<a;i++){
              if(arr[i]==2)  count22++;
              if(count22==count2/2) {
                  ans=i+1;
                  break;
 
              }
           }
            System.out.println(ans);
           }
 
        }
    }
}