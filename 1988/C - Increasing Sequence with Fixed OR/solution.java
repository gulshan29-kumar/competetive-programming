import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long a = in.nextLong();
            processNumber(a);
        }
        in.close();
    }
 
    public static void processNumber(long n) {
        List<Long> results = new ArrayList<>();
 
        // Step 1: Add the number itself first
        results.add(n);
 
        // Step 2: Iterate through bits (LSB -> MSB)
        for (int i = 0; i < 60; i++) {
            if (((n >> i) & 1L) == 1L) {
                long modified = n & ~(1L << i); // remove bit i
                if (modified != 0) {           // skip zero
                    results.add(modified);
                }
            }
        }
 
        // Step 3: If original number is odd, subtract 1 from elements at odd positions that are odd
        Collections.sort(results);
 
        // Step 5: Print results
        System.out.println(results.size());
        for (long it : results) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}