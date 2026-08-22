import java.util.Scanner;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int t = in.nextInt();  // number of test cases
 
        while (t-- > 0) {
            int n = in.nextInt(); // number of days
            int k = in.nextInt(); // required good weather days for a hike
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
 
            int maxHikes = 0;
            int i = 0;
 
            while (i <= n - k) {
                boolean canHike = true;
 
                // Check if all days from i to i + k - 1 are good (0)
                for (int j = i; j < i + k; j++) {
                    if (a[j] == 1) {
                        canHike = false;
                        i = j + 1; // Skip past the rainy day
                        break;
                    }
                }
 
                if (canHike) {
                    maxHikes++;
                    i = i + k + 1; // Move past k days and one rest day
                }
            }
 
            System.out.println(maxHikes);
        }
 
        in.close();
    }
}