import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long mod = 1000000007L;
 
        while (t-- > 0) {
            long n = in.nextLong();
 
            long sum = (((((n % mod) * ((4 * n - 1) % mod)) % mod)
                    * ((n + 1) % mod)) % mod
                    * 337) % mod;
 
            System.out.println(sum);
        }
    }
}