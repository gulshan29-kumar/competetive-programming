import java.util.*;
 
public class god{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int t = in.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt() - 1; // convert to 0-based index
 
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = in.nextInt();
            }
 
            int currentHeight = h[k];
            int waterLevel = 0;
 
            // Collect all taller towers
            List<Integer> taller = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (h[i] > currentHeight) {
                    taller.add(h[i]);
                }
            }
 
            // Sort taller towers in ascending order
            Collections.sort(taller);
 
            boolean possible = false;
 
            for (int target : taller) {
                int diff = Math.abs(currentHeight - target);
                if (waterLevel + diff <= currentHeight) {
                    waterLevel += diff;
                    currentHeight = target;
                } else {
                    // You would die before reaching
                    possible = false;
                    break;
                }
            }
 
            // Final check: did we reach the max height?
            int maxHeight = Arrays.stream(h).max().getAsInt();
            if (currentHeight == maxHeight) {
                possible = true;
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
 
        in.close();
    }
}