import java.util.*;
 
public class qwe {
 
    public static void main(String[] args) {
        int MAXN = 1_000_000;
        boolean[] isPossible = new boolean[MAXN + 1];
 
        // Precompute possible snowflake vertex counts
        for (long i = 2; i <= 10000; i++) {  // i is the base
            long current = i * i * i;        // i^3
            long current1 = (current - 1) / (i - 1);
 
            while (current1 <= MAXN) {
                isPossible[(int) current1] = true;
                current *= i;
                current1 = (current - 1) / (i - 1);
            }
        }
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            if(isPossible[a]) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}