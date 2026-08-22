import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int[][] mat = new int[a][b];
            int[][] mat2 = new int[a][b];
            int max = Integer.MIN_VALUE;
 
            // Read matrix and track global max
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    mat[i][j] = in.nextInt();
                    mat2[i][j] = mat[i][j];
                    max = Math.max(max, mat[i][j]);
                }
            }
 
            // First approach
            int[] rowCount = new int[a];
            int[] colCount = new int[b];
 
            // Count max values per row
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (mat[i][j] == max) {
                        rowCount[i]++;
                    }
                }
            }
 
            // Find row with most max values
            int r = 0;
            for (int i = 1; i < a; i++) {
                if (rowCount[i] > rowCount[r]) r = i;
            }
 
            // Decrement entire row `r`
            for (int i = 0; i < b; i++) {
                mat[r][i]--;
            }
 
            // Recalculate max value appearances in columns
            Arrays.fill(colCount, 0);
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (mat[i][j] == max) {
                        colCount[j]++;
                    }
                }
            }
 
            // Find column with most max values
            int c = 0;
            for (int i = 1; i < b; i++) {
                if (colCount[i] > colCount[c]) c = i;
            }
 
            // Decrement column `c`, excluding row `r`
            for (int i = 0; i < a; i++) {
                if (i != r) {
                    mat[i][c]--;
                }
            }
 
            // Calculate the new maximum for approach 1
            int newMax = Integer.MIN_VALUE;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    newMax = Math.max(newMax, mat[i][j]);
                }
            }
 
            // Second approach using mat2
            int[] rowCount1 = new int[a];
            int[] colCount1 = new int[b];
 
            // Count max values per column
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (mat2[i][j] == max) {
                        colCount1[j]++;
                    }
                }
            }
 
            // Find column with most max values
            c = 0;
            for (int i = 1; i < b; i++) {
                if (colCount1[i] > colCount1[c]) c = i;
            }
 
            // Decrement entire column `c`
            for (int i = 0; i < a; i++) {
                mat2[i][c]--;
            }
 
            // Count max values per row
            Arrays.fill(rowCount1, 0);
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (mat2[i][j] == max) {
                        rowCount1[i]++;
                    }
                }
            }
 
            // Find row with most max values
            r = 0;
            for (int i = 1; i < a; i++) {
                if (rowCount1[i] > rowCount1[r]) r = i;
            }
 
            // Decrement row `r` except column `c`
            for (int i = 0; i < b; i++) {
                if (i != c) {
                    mat2[r][i]--;
                }
            }
 
            // Calculate the new maximum for approach 2
            int newMax1 = Integer.MIN_VALUE;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    newMax1 = Math.max(newMax1, mat2[i][j]);
                }
            }
 
            // Print the minimum of two maximums
            System.out.println(Math.min(newMax, newMax1));
        }
 
        in.close();
    }
}