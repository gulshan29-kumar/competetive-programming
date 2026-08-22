import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a=in.nextInt();
            long c=in.nextLong();
            for(int i=1;i<a;i++) c=c&(in.nextLong());
            System.out.println(c);
        }
    }
}