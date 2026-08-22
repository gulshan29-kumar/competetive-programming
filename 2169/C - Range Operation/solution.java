import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while(t-- > 0) {
            int a = in.nextInt();
            long arr[] = new long[a];
 
            for(int i = 0; i < a; i++)
                arr[i] = in.nextLong();
 
            long prefix[] = new long[a+1];
            for(int i = 1; i <= a; i++)
                prefix[i] = prefix[i-1] + arr[i-1];
 
            long max = 0;
            int j = 1;
 
            for(int i = 1; i <= a; i++) {
                while(j <= a) {
                    long val = (long)(i + j) * (j - i + 1)
                            - (prefix[j] - prefix[i-1]);
 
                    if (val < 0) break;
 
                    max = Math.max(max, val);
                    j++;
                }
 
                if(j < i) j = i;
            }
 
            System.out.println(max + prefix[a]);
        }
    }
}