import java.util.*;
public class qwe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] p = new int[n];
 
            int firstEven = (n % 2 == 0) ? n : n-1; // last even
            int lastEven = 2; // first even
 
            p[0] = firstEven;
            p[n-1] = 1; // last position
 
            for(int i = 1; i < n-1; i++){
                if((i+1) % 2 == 0){ // even position
                    p[i] = i+2;
                } else { // odd position
                    p[i] = i;
                }
            }
 
            for(int i = 0; i < n; i++)
                System.out.print(p[i] + (i==n-1?"
":" "));
        }
        sc.close();
    }
}