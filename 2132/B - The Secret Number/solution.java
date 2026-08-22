import java.util.*;
 
public class god {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            long n = in.nextLong();
            List<Long> results = new ArrayList<>();
 
            for (int k = 1; k <= 18; k++) {
                long d = (long) Math.pow(10, k) + 1;
                if (d > n) break;
                if (n % d == 0) {
                    results.add(n / d);
                }
            }
 
            if (results.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(results);
                System.out.print(results.size() + "
");
                for (int i = 0; i < results.size(); i++) {
                    System.out.print(results.get(i) + (i + 1 < results.size() ? " " : ""));
                }
                System.out.println();
            }
        }
    }
}