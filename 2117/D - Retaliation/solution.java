import java.io.*;
 
public class  god {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(s[i]);
            }
            if (n == 1) {
                System.out.println("NO");
                continue;
            }
            long a0 = a[0];
            long an = a[n - 1];
            long denominator = 1 - n * n;
            long numeratorY = an - n * a0;
            if (numeratorY % denominator != 0) {
                System.out.println("NO");
                continue;
            }
            long y = numeratorY / denominator;
            long x = a0 - n * y;
            if (x < 0 || y < 0) {
                System.out.println("NO");
                continue;
            }
            boolean possible = true;
            for (int i = 1; i < n - 1; i++) {
                long current = a[i];
                long required = x * (i + 1) + y * (n - i);
                if (required != current) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}