import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
 
            int a = in.nextInt();
            long arr[] = new long[a];
            long arr2[] = new long[a];
 
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextLong();
                arr2[i] = arr[i];
            }
 
            Arrays.sort(arr2);
 
            long prefix[] = new long[a];
            prefix[0] = arr2[0];
            for (int i = 1; i < a; i++) {
                prefix[i] = prefix[i - 1] + arr2[i];
            }
 
            Map<Long, Integer> map = new HashMap<>();
 
            int it = a - 1;
            int ans = a - 1;
 
            while (it != 0) {
 
                // when it == a-1
                if (it == a - 1) {
                    map.put(arr2[it], it);
                    it--;
                }
 
                else {
                    // FIX: prevent arr2[it+1] out of range
                    if (it + 1 < a && prefix[it] >= arr2[it + 1]) {
                        if (!map.containsKey(arr2[it])) {
                            map.put(arr2[it], ans);
                        }
                        it--;
                    }
                    else {
                        ans = it;
                        if (!map.containsKey(arr2[it])) {
                            map.put(arr2[it], ans);
                        }
                        it--;
                    }
                }
            }
 
            for (int i = 0; i < a; i++) {
                if(map.get(arr[i])!=null) System.out.print(map.get(arr[i]) + " ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}