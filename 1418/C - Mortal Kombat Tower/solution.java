import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;
        
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
    
            if(n == 1) {
                System.out.println(arr[0]);
                continue;
            }
            
            int[][] dp = new int[n][2];
            int INF = (int) 1e9; 
            
            for(int i = 0; i < n; i++) {
                dp[i][0] = INF;
                dp[i][1] = INF;
            }
            
            // Base Cases
            dp[0][0] = arr[0]; 
            dp[0][1] = INF;    
            
            dp[1][0] = arr[0] + arr[1]; 
            dp[1][1] = arr[0];        
            
            for(int i = 2; i < n; i++) {
                int friendKillsOne = dp[i-1][1] + arr[i];
                int friendKillsTwo = dp[i-2][1] + arr[i-1] + arr[i];
                dp[i][0] = Math.min(friendKillsOne, friendKillsTwo);
                int youKillOne = dp[i-1][0]; // You use 0 skip points
                int youKillTwo = dp[i-2][0]; // You use 0 skip points
                dp[i][1] = Math.min(youKillOne, youKillTwo);
            }
            
            // The answer is the minimum between either player finishing the tower
            System.out.println(Math.min(dp[n-1][0], dp[n-1][1]));
        }
    }
}