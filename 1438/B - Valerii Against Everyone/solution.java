import java.util.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
         int a=in.nextInt();
         long arr[]=new long[a];
         for(int i=0;i<a;i++){
             arr[i]=in.nextLong();
         }
          Set<Long> set=new HashSet<>();
         for(long it:arr) set.add(it);
         if(set.size()<a) System.out.println("Yes");
         else System.out.println("No");
        }
     }
}