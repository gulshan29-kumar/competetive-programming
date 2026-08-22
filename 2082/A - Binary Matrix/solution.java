import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
 
            for (int i = 0; i < n; i++) {
                String row = sc.next();
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = row.charAt(j) - '0';
                }
            }
 
            int[] rowXOR = new int[n];
            int[] colXOR = new int[m];
            int oddRows = 0, oddCols = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    rowXOR[i] ^= matrix[i][j];
                    colXOR[j] ^= matrix[i][j];
                }
            }
            for (int i = 0; i < n; i++) if (rowXOR[i] == 1) oddRows++;
            for (int j = 0; j < m; j++) if (colXOR[j] == 1) oddCols++;
            int minChanges = Math.max(oddRows, oddCols);
            System.out.println(minChanges);
        }
    }
}
 