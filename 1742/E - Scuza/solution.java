import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
         int a=in.nextInt();
         int b=in.nextInt();
         int arr[]=new int[a];
         int ans[]=new int[b];
         for(int i=0;i<a;i++) {
             arr[i]=in.nextInt();
         }
         for(int i=0;i<b;i++) ans[i]=in.nextInt();
         TreeMap<Integer,Long> freq=new TreeMap<>();
         long sum=0;
         int max=0;
         for(int i=0;i<a;i++){
             if(max>=arr[i]) sum+=arr[i];
             else{
                 freq.put(max,sum);
                 sum+=arr[i];
                 max=arr[i];
             }
         }
            freq.put(max,sum);
           for(int i=0;i<b;i++){
               Integer key = freq.floorKey(ans[i]);
               if(key==null) System.out.print(0+" ");
               else System.out.print(freq.get(key)+" ");
           }
            System.out.println();
 
        }
    }
}