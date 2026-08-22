import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int arr[][] = new int[a][b];
 
            // Reading input
            for (int i = 0; i < a; i++) {
                String str=in.next();
                for (int j = 0; j < b; j++) {
                    if(str.charAt(j)=='1') arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
 
            boolean valid = true; // Assume valid unless proven otherwise
 
            // Check all 1s in the matrix
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (arr[i][j] == 1) {
                        if (!traverse(arr, i, j)) {
                            valid = false;
                            break;
                        }
                    }
                }
                if (!valid) break; // Break outer loop as well
            }
 
            System.out.println(valid ? "Yes" : "NO");
        }
        in.close();
    }
 
    static boolean traverse(int arr[][], int i, int j) {
        int rowSum = 0;
        if(i==0||j==0) return true;
        for (int k = 0; k <= i; k++) {
            rowSum += arr[k][j];
        }
        if (rowSum == i + 1) return true; // Checking column-wise
 
        int colSum = 0;
        for (int k = 0; k <= j; k++) {
            colSum += arr[i][k];
        }
        if (colSum == j + 1) return true; // Checking row-wise
 
        return false; // If neither condition holds, return false
    }
}