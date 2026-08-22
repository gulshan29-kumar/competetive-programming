import java.util.*;
 
public class god{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            String str = in.next();
            int cnt01=0;
            int count0=0;
            int cnt10=0;
            for (int i = 0; i < a - 1; i++) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    count0++;
                }
                if(str.charAt(i)=='0'&&str.charAt(i+1)=='1') cnt01++;
                if(str.charAt(i)=='1'&&str.charAt(i+1)=='0')  cnt10++;
            }
             int ans=a+count0;
            if(str.charAt(0)=='1') ans++;
            if(Math.max(cnt01,cnt10)>=2) ans-=2;
            else if(Math.max(cnt01,cnt10)==1) ans=a+1;
            else {
                if(str.charAt(0)=='1') ans=a+1;
                else ans=ans;
            }
            System.out.println(ans);
 
 
 
        }
    }
}