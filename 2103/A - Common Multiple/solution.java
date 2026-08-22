import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a=in.nextInt();
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<a;i++){
                int c=in.nextInt();
                if(!set.contains(c)) set.add(c);
            }
            System.out.println(set.size());
        }
    }
}