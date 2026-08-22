import java.util.*;
import java.io.*;
 
public class Codechef {
    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
 
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
 
        for(int i = 0; i < n; i++) a[i] = in.nextInt();
        for(int i = 0; i < n; i++) b[i] = in.nextInt();
 
        Map<String, Integer> map = new HashMap<>();
        int extra = 0;
 
        for(int i = 0; i < n; i++) {
 
            if(a[i] == 0) {
                if(b[i] == 0) extra++;
                continue;
            }
 
            int p = -b[i];
            int q = a[i];
 
            int g = gcd(Math.abs(p), Math.abs(q));
            p /= g;
            q /= g;
 
            if(q < 0) {
                p = -p;
                q = -q;
            }
 
            String key = p + "/" + q;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
 
        int max = 0;
        for(int val : map.values()) {
            max = Math.max(max, val);
        }
 
        System.out.println(max + extra);
    }
 
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}