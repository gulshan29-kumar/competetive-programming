import java.util.*;
import java.lang.*;
import java.io.*;
 
// NAME = GULSHAN KUMAR : SECTION-B : ROLL NO = 2024ug1107
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            long b = in.nextLong();   // store as long
            long arr1[] = new long[a];
            long arr2[] = new long[a];
 
            for (int i = 0; i < a; i++) {
                arr1[i] = in.nextLong();
            }
            for (int i = 0; i < a; i++) {
                arr2[i] = in.nextLong();
            }
 
            long arr[][] = new long[a][2];
            for (int i = 0; i < a; i++) {
                arr[i][0] = arr1[i];
                arr[i][1] = arr2[i];
            }
 
            Arrays.sort(arr, Comparator.comparingLong(d -> d[1]));  // sort by second element
 
            long sum = 1;
            long ans = b;
            int j = -1;
            for (int i = 0; i < a; i++) {
                if (arr[i][1] < b && sum < a) {
                    ans += arr[i][0] * arr[i][1];
                    sum += arr[i][0];
                    j = i;
                } else break;
            }
 
            if (sum < a) ans += (a - sum) * b;
            if (sum > a) ans -= (sum - a) * arr[j][1];
 
            System.out.println(ans);
        }
    }
}