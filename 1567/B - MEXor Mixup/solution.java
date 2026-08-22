import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            long xor=(xorTill(a-1));
            if(xor==b) System.out.println(a);
            else if((xor^b)!=a) System.out.println(a+1);
            else System.out.println(a+2);
        }
    }
    private static long xorTill(long n) {
        // Determine the remainder of n when divided by 4
        long a = n % 4;
        // Depending on the remainder, return the appropriate XOR value
        if (a == 0) {
            return n;
        } else if (a == 1) {
            return 1;
        } else if (a == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }
 
}