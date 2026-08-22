import java.io.*;
import java.util.*;
import java.math.BigInteger;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
 
            int a = in.nextInt();
            long b = in.nextLong();
 
            BigInteger sum = BigInteger.ZERO;
            BigInteger sumSq = BigInteger.ZERO;
 
            for (int i = 0; i < a; i++) {
                long c = in.nextLong();
                sum = sum.add(BigInteger.valueOf(c));
                sumSq = sumSq.add(BigInteger.valueOf(c).multiply(BigInteger.valueOf(c)));
            }
 
            // A = 4a
            BigInteger A = BigInteger.valueOf(4L * a);
            // B = 4 * sum
            BigInteger B = sum.shiftLeft(2);
            // C = sumSq - b
            BigInteger C = sumSq.subtract(BigInteger.valueOf(b));
 
            // D = B*B - 4*A*C
            BigInteger fourA = A.shiftLeft(2);
            BigInteger D = B.multiply(B).subtract(fourA.multiply(C));
 
            if (D.signum() < 0) {
                System.out.println(0);
                continue;
            }
 
            BigInteger sqrtD = sqrtBig(D);
 
            // root = (sqrt(D) - B) / (2A)
            BigInteger numerator = sqrtD.subtract(B);
            BigInteger denominator = A.shiftLeft(1); // 2A
 
            BigInteger w = numerator.divide(denominator);
 
            System.out.println(w);
        }
    }
 
    // BigInteger sqrt using Newton's method
    public static BigInteger sqrtBig(BigInteger n) {
        if (n.signum() <= 0) return BigInteger.ZERO;
 
        BigInteger x = n.shiftRight(n.bitLength() / 2);
        BigInteger last;
 
        do {
            last = x;
            x = x.add(n.divide(x)).shiftRight(1);
        } while (x.subtract(last).abs().compareTo(BigInteger.ONE) > 0);
 
        return x.min(last);
    }
}