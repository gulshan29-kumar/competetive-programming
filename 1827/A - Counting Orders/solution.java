import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long mod = 1000000007L;
 
        while (t-- > 0) {
            int a = in.nextInt();
            long arr1[] = new long[a];
            long arr2[] = new long[a];
 
            for (int i = 0; i < a; i++) arr1[i] = in.nextLong();
            for (int i = 0; i < a; i++) arr2[i] = in.nextLong();
 
            Arrays.sort(arr1);
            Arrays.sort(arr2);
 
            int j = a - 1;
            int bool = 0;
            long ways = 1;
            long count = 0;
            int i = a - 1;
 
            while (j >= 0) {
                if (i >= 0 && arr2[j] < arr1[i]) {
                    i--;
                    count++;
                } else {
                    long val = count - (a - 1 - j);
                    if (val <= 0) {
                        bool = 1;
                        break;
                    }
                    ways = (ways * (val % mod)) % mod;
                    j--;
                }
            }
 
            if (bool == 1) System.out.println(0);
            else System.out.println(ways);
        }
    }
}