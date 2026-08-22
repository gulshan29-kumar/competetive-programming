import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
 
            boolean possible = false;
 
            // Case 1: b is middle
            if ((a + c) % (2 * b) == 0 && (a + c) / (2 * b) > 0) {
                possible = true;
            }
            // Case 2: scale a
            else if ((2 * b - c) % a == 0 && (2 * b - c) / a > 0) {
                possible = true;
            }
            // Case 3: scale c
            else if ((2 * b - a) % c == 0 && (2 * b - a) / c > 0) {
                possible = true;
            }
 
            if (possible) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}