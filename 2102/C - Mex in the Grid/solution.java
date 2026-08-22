import java.util.Scanner;
 
public class qwe{
    public static void fillSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
 
        int value = n * n - 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value--;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value--;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value--;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value--;
                }
                left++;
            }
        }
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        fillSpiralMatrix(n);
        }
    }
}
 
 