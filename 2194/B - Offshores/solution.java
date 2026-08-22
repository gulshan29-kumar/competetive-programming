import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
 
            long[] arr = new long[(int) a];
            long sum = 0;
 
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextLong();
                sum += arr[i] / b;
            }
 
            long max = Long.MIN_VALUE;
 
            for (int i = 0; i < a; i++) {
                max = Math.max(
                        max,
                        arr[i] + (sum - arr[i] / b) * c
                );
            }
 
            System.out.println(max);
        }
    }
}