import java.io.*;
import java.util.*;
 
public class Codechef {
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int a = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
 
        int arr[] = new int[a];
        int arr2[] = new int[a];
 
        // Read array
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
 
        Arrays.sort(arr);
 
        // Queries
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken()) - 1;
            int r = Integer.parseInt(st.nextToken());
 
            arr2[l]++;
            if (r < a) arr2[r]--;
        }
 
        // Prefix sum
        for (int i = 1; i < a; i++) {
            arr2[i] += arr2[i - 1];
        }
 
        Arrays.sort(arr2);
 
        long ans = 0;
 
        for (int i = a - 1; i >= 0; i--) {
            ans += (long) arr2[i] * arr[i];
        }
 
        System.out.println(ans);
    }
}