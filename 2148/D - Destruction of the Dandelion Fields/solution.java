import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            List<Long> oddList = new ArrayList<>();
            long evenSum = 0;
 
            for (int i = 0; i < a; i++) {
                long curr = in.nextLong();
                if (curr % 2 == 0) {
                    evenSum += curr;
                } else {
                    oddList.add(curr);
                }
            }
 
            if (oddList.isEmpty()) {
                System.out.println(0);
                continue;
            }
 
            // Sort odd numbers
            Collections.sort(oddList);
 
            // Take largest (oddcnt/2 + 1) odd numbers
            int oddcnt = oddList.size();
            int takeCount = 0;
            if(oddcnt%2==0) takeCount=oddcnt/2;
            else takeCount=oddcnt/2+1;
            long oddSum = 0;
            for (int i = oddList.size() - 1; i >= oddList.size() - takeCount; i--) {
                oddSum += oddList.get(i);
            }
 
            long result = evenSum + oddSum;
            System.out.println(result);
        }
    }
}