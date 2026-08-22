import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
 
            int a = in.nextInt();
            int b = in.nextInt();
 
            long arr[][] = new long[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) arr[i][j] = in.nextLong();
            }
 
            long arr1[][] = new long[b][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr1[j][i] = arr[i][j];
                }
            }
 
            long ans = 0;
 
            for (int i = 0; i < b; i++) {
                Arrays.sort(arr1[i]);  // sort each row of size a
 
                long sum = 0;
                for (int j = 0; j < a; j++) {
                    ans += arr1[i][j] * j - sum;
                    sum += arr1[i][j];
                }
            }
 
            System.out.println(ans);
        }
    }
}