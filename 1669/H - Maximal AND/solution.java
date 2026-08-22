import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            long n = in.nextLong();
            long arr[] = new long[a];
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextLong();
            }
 
            int freq[] = new int[31];  // counting set bits at each position
            for (int i = 0; i < a; i++) {
                long no = arr[i];
                for (int j = 0; j <= 30; j++) {
                    if ((no & (1L << j)) != 0) { // correct bit check
                        freq[j]++;
                    }
                }
            }
            long ans=0;
            for(int i=30;i>=0;i--){
                if(a-freq[i]<=n) {
                    ans+=Math.pow(2,i);
                    n-=a-freq[i];
                }
            }
            System.out.println(ans);
 
        }
    }
}