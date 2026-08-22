import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int b = in.nextInt();
            int[] a = new int[b];
            for (int i = 0; i < b; i++) {
                a[i] = in.nextInt();
            }
 
            int count0 = 0;
            int prev1 = -2;
            for (int i = 0; i < b; i++) {
                if (a[i] > prev1 + 1) {
                    count0++;
                    prev1 = a[i];
                }
            }
 
            System.out.println(count0);
        }
    }
}