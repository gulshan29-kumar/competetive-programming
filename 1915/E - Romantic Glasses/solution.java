import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a=in.nextInt();
            long arr[]=new long[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextLong();
            }
            Map<Long,Long> ma=new HashMap<>();
            ma.put(0L,1L);
            long sum=0;
            Boolean bool=false;
            for(int i=0;i<a;i++){
               if(i%2==0) sum+=arr[i];
               else sum-=arr[i];
               if(ma.containsKey(sum)){
                   bool=true;
                   break;}
               else ma.put(sum,i+0L);
 
            }
            if(bool) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}