import java.io.*;
import java.util.*;
 
public class Codechef {
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
 
            int a = Integer.parseInt(br.readLine());
 
            String str1 = br.readLine();
            String str2 = br.readLine();
 
            int idx = a - 1;
            StringBuilder ans = new StringBuilder();
 
            int count1 = -1;
 
            for (int i = 1; i < a; i++) {
                if (str1.charAt(i) == '1' && str2.charAt(i - 1) == '0') {
                    idx = i;
                    count1 = i;
                    break;
                }
            }
 
            if (count1 != -1) idx--;
 
            for (int i = 0; i <= idx; i++) {
                ans.append(str1.charAt(i));
            }
 
            for (int i = idx; i < a; i++) {
                ans.append(str2.charAt(i));
            }
 
            int count = 0;
 
            while (idx - 1 >= 0) {
                if (str1.charAt(idx) != str2.charAt(idx - 1)) {
                    break;
                }
                count++;
                idx--;
            }
 
            count++;
 
            System.out.println(ans.toString());
            System.out.println(count);
        }
    }
}