import java.util.*;
import java.math.BigInteger;
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
 
        while (t--> 0) {
           long a=in.nextLong();
           long b=in.nextLong();
           String y=fun(a,b);
            BigInteger big = new BigInteger(y);
            if (big.isProbablePrime(20)) {
                System.out.println("Yes");
            }
            else
                System.out.println("NO");
 
        }
    }
    static String fun(long a,long b){
        String str="";
        for(int i=1;i<=b;i++){
            str=str+a;
        }
        return str;
    }
 
}