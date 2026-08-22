import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
 
            long arr1[] = new long[a];
            long arr2[] = new long[a];
 
            for (int i = 0; i < a; i++) {
                arr1[i] = in.nextLong();
                arr2[i] = arr1[i];
            }
 
            Arrays.sort(arr2);
 
            int i = 0;
            int count = 0;
 
            while (i < a) {
                int idx = Arrays.binarySearch(arr2, arr1[i]);
 
                while (idx < a && i < a) {
                    if (arr1[i] == arr2[idx]) {
                        i++;
                        idx++;
                    } else {
                        break;
                    }
                }
                count++;
            }
 
            if (count <= b) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}