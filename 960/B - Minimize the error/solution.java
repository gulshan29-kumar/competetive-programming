import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;
        
        int a = in.nextInt();
        int k1 = in.nextInt();
        int k2 = in.nextInt();
        
        // Using long to prevent overflow on large inputs
        long[] arr1 = new long[a];
        long[] arr2 = new long[a];
        long[] arr3 = new long[a];
        
        for (int i = 0; i < a; i++) arr1[i] = in.nextLong();
        for (int i = 0; i < a; i++) arr2[i] = in.nextLong();
        
        long sumDiff = 0;
        for (int i = 0; i < a; i++) {
            arr3[i] = Math.abs(arr2[i] - arr1[i]);
            sumDiff += arr3[i];
        }
        
        Arrays.sort(arr3);
        long k = (long) k1 + k2;
        if (k >= sumDiff) {
            System.out.println((k - sumDiff) % 2);
            return;
        }
        
        long ans = 0;
        int cnt = 1;
        long las = arr3[a - 1]; 
        
   
        for (int i = a - 2; i >= 0; i--) {
            long diff = arr3[i + 1] - arr3[i];
            
            if (cnt * diff <= k) {
                k -= cnt * diff;
                cnt++;
                las = arr3[i]; 
            } else {
                break;
            }
        }
        
        for (int i = 0; i < a - cnt; i++) {
            ans += arr3[i] * arr3[i];
        }
        
        long dec = k / cnt;
        long rem = k % cnt;
        
        long high = las - dec;
        long low = las - dec - 1;
        
        ans += rem * (low * low);
        ans += (cnt - rem) * (high * high);
        
        System.out.println(ans);
    }
}