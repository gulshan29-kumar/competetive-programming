import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
         long a=in.nextInt();
         Map<Long,Integer> map=new HashMap<>();
         for(int i=0;i<a;i++){
             long c=in.nextLong();
             map.put(c, map.getOrDefault(c,0)+1);
         }
         int ans=0;
         for(Long it:map.keySet()){
             ans+=Math.max(map.get(it)-map.getOrDefault(it-1,0),0);
         }
            System.out.println(ans);
 
        }
    }
}