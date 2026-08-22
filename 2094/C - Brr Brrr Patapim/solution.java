import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int a = in.nextInt();
           Set<Integer> set=new LinkedHashSet<>();
 
            // Read a^2 elements and store in a list (temporarily)
            for (int i = 0; i < a * a; i++) {
                set.add(in.nextInt());
            }
 
            // Add missing elements from front (1 to 2a)
            int ans=-1;
            for(int i=1;i<=2*a;i++){
                if(!set.contains(i)) ans=i;
            }
 
            // Add input elements (preserving original order)
            System.out.print(ans+" ");
            for (int it :set) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}