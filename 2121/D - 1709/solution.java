import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int a = in.nextInt();
            int[] arr1 = new int[a];
            int[] arr2 = new int[a];
 
            for (int i = 0; i < a; i++) arr1[i] = in.nextInt();
            for (int i = 0; i < a; i++) arr2[i] = in.nextInt();
 
            int k = 0;
            int[][] arr = new int[1710][2]; // fixed size (assumes small a)
 
            // Bubble sort arr1
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a - i - 1; j++) {  // fix: j+1 < a
                    if (arr1[j + 1] < arr1[j]) {
                        int temp = arr1[j + 1];
                        arr1[j + 1] = arr1[j];
                        arr1[j] = temp;
                        arr[k][0] = 1;
                        arr[k++][1] = j + 1; // store 1-based index
                    }
                }
            }
 
            // Bubble sort arr2
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a - i - 1; j++) {  // fix: j+1 < a
                    if (arr2[j + 1] < arr2[j]) {
                        int temp = arr2[j + 1];
                        arr2[j + 1] = arr2[j];
                        arr2[j] = temp;
                        arr[k][0] = 2;
                        arr[k++][1] = j + 1; // store 1-based index
                    }
                }
            }
 
            // Compare arrays
            int i = 0, j = 0;
            while (i < a && j < a) {
                if (arr1[i] > arr2[j]) {
                    arr[k][0] = 3;
                    arr[k++][1] = j + 1;
                }
                i++;
                j++;
            }
 
            // Output
            System.out.println(k);
            for (int l = 0; l < k; l++) {
                System.out.println(arr[l][0] + " " + arr[l][1]);
            }
        }
 
        in.close();
    }
}