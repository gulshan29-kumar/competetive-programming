import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while(t-- > 0){
 
            int n = in.nextInt();
            int k = in.nextInt();
            int p = in.nextInt();
            int m = in.nextInt();
 
            int arr[] = new int[n];
 
            for(int i = 0; i < n; i++)
                arr[i] = in.nextInt();
 
            int ans = 0;
 
            List<Integer> list = new ArrayList<>();
 
            if(p <= k && arr[p-1] < m){
                ans++;
                m -= arr[p-1];
            }
            else{
 
                int req2 = p - (k - 1);
 
                long sum = 0;
 
                for(int i = 0; i < p-1; i++){
                    list.add(arr[i]);
                    sum += arr[i];
                }
 
                Collections.sort(list);
 
                for(int i = list.size()-1; i >= list.size()-(k-1) && i >= 0; i--){
                    sum -= list.get(i);
                }
 
                sum += arr[p-1];
 
                if(sum > m){
                    System.out.println(0);
                    continue;
                }
                else{
                    ans++;
                    m -= sum;
                }
            }
 
            int req = (n - (k - 1));
 
            List<Integer> list1 = new ArrayList<>();
 
            long sum = 0;
 
            for(int i = 0; i < n; i++){
                if(i != p-1){
                    list1.add(arr[i]);
                    sum += arr[i];
                }
            }
 
            Collections.sort(list1);
 
            for(int i = list1.size()-1; i >= list1.size()-(k-1) && i >= 0; i--){
                sum -= list1.get(i);
            }
 
            sum += arr[p-1];
 
            System.out.println(ans + m/sum);
        }
    }
}