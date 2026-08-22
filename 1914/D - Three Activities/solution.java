import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int[][][] arr4 = new int[3][a][2];
 
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < a; col++) {
                    arr4[row][col][0] = in.nextInt();
                    arr4[row][col][1] = col;
                }
                Arrays.sort(arr4[row], (x, y) -> Integer.compare(x[0], y[0]));
            }
            Arrays.sort(arr4, (x, y) -> Integer.compare(x[a - 1][0], y[a - 1][0]));
 
            int[][] top3Row0 = Arrays.copyOfRange(arr4[0], a - 3, a);
            int[][] top3Row1 = Arrays.copyOfRange(arr4[1], a - 3, a);
            int[][] top3Row2 = Arrays.copyOfRange(arr4[2], a - 3, a);
 
            long maxSum = 0;
 
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        int idx0 = top3Row0[i][1];
                        int idx1 = top3Row1[j][1];
                        int idx2 = top3Row2[k][1];
 
                        if (idx0 != idx1 && idx0 != idx2 && idx1 != idx2) {
                            long sum = top3Row0[i][0] + top3Row1[j][0] + top3Row2[k][0];
                            maxSum = Math.max(maxSum, sum);
                        }
                    }
                }
            }
 
            System.out.println(maxSum);
        }
    }
}