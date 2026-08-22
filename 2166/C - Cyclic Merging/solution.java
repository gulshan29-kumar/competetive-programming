import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
          int a=in.nextInt();
          long arr[]=new long[a];
          for(int i=0;i<a;i++) arr[i]=in.nextLong();
          long sum=0;
          long max=Integer.MIN_VALUE;
          for(int i=0;i<a-1;i++){
              sum+=Math.max(arr[i],arr[i+1]);
              max=Math.max(arr[i],max);
          }
          max=Math.max(max,arr[a-1]);
          sum+=Math.max(arr[0],arr[a-1]);
            System.out.println(sum-max);
 
 
        }
    }
}