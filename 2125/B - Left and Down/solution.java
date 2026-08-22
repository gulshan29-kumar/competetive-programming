import java.util.*;
 
public class god {
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long k = in.nextLong();
 
            long g = gcd(a, b);
 
            long dx = a / g;
            long dy = b / g;
 
            if (Math.max(dx, dy) <= k) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}