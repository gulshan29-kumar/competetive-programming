import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l1 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int l2 = scanner.nextInt();
            int b2 = scanner.nextInt();
            int l3 = scanner.nextInt();
            int b3 = scanner.nextInt();
 
            int totalArea = l1 * b1 + l2 * b2 + l3 * b3;
            int k = (int) Math.sqrt(totalArea);
 
            if (k * k != totalArea) {
                System.out.println("NO");
                continue;
            }
 
            boolean possible = false;
 
            // Check all in a row or column
            if ((l1 + l2 + l3 == k && b1 == b2 && b2 == b3 && b1 == k) ||
                    (b1 + b2 + b3 == k && l1 == l2 && l2 == l3 && l1 == k)) {
                possible = true;
            }
 
            // Check largest rectangle placed first, then others
            // Case 1: place l1 x b1, remaining (k - l1) x k
            if (!possible) {
                int remainingArea = (k - l1) * k;
                if (remainingArea == l2 * b2 + l3 * b3) {
                    // Check if the other two can fit in (k - l1) x k
                    // Either side by side: l2 + l3 <= k - l1 and b2 == b3 == k
                    if ((l2 + l3 <= k - l1 && b2 == k && b3 == k) ||
                            (b2 + b3 <= k && l2 == k - l1 && l3 == k - l1)) {
                        possible = true;
                    }
                }
            }
 
            // Case 2: place l1 x b1, remaining k x (k - b1)
            if (!possible) {
                int remainingArea = k * (k - b1);
                if (remainingArea == l2 * b2 + l3 * b3) {
                    // Check if the other two can fit in k x (k - b1)
                    // Either side by side: l2 + l3 <= k and b2 == b3 == k - b1
                    if ((l2 + l3 <= k && b2 == k - b1 && b3 == k - b1) ||
                            (b2 + b3 <= k - b1 && l2 == k && l3 == k)) {
                        possible = true;
                    }
                }
            }
 
            // Check other combinations where two rectangles are combined first
            // Combine l2 x b2 and l3 x b3 to form a rectangle, then with l1 x b1
            if (!possible) {
                // Try combining l2 and l3 side by side (same height)
                if (b2 == b3) {
                    int combinedLength = l2 + l3;
                    int combinedBreadth = b2; // == b3
                    // Now, combined rectangle is (l2 + l3) x b2
                    // Check if this plus l1 x b1 can form the square
                    if ((combinedLength == k && b1 + combinedBreadth == k && l1 == k) ||
                            (combinedBreadth == k && l1 + combinedLength == k && b1 == k)) {
                        possible = true;
                    }
                }
                // Try combining b2 and b3 (same length)
                if (l2 == l3) {
                    int combinedBreadth = b2 + b3;
                    int combinedLength = l2; // == l3
                    // Now, combined rectangle is l2 x (b2 + b3)
                    // Check if this plus l1 x b1 can form the square
                    if ((combinedLength == k && b1 + combinedBreadth == k && l1 == k) ||
                            (combinedBreadth == k && l1 + combinedLength == k && b1 == k)) {
                        possible = true;
                    }
                }
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
        scanner.close();
    }
}