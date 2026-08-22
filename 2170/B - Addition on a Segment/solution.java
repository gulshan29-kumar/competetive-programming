import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
 
            long a = in.nextLong();   // long
            long arr[] = new long[(int)a];  // array size must remain int
 
            long sum = 0;
 
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextLong();      // long input
                if (arr[i] != 0) sum += arr[i] - 1;   // long arithmetic
            }
 
            Arrays.sort(arr);  // works for long[]
 
            int i = 0;
            while (i < a && arr[i] == 0) i++;
 
            long len = a - i;
            long val = a - sum;    // use new variable (a already used as size)
 
            if (val > 0) System.out.println(len - val + 1);
            else System.out.println(len);
        }
    }
}