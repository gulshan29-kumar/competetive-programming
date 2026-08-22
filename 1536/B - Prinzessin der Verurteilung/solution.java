import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int t = in.nextInt();
        while (t-- > 0) {
 
            int a = in.nextInt();
            String str = in.next();
 
            String ans = null;
 
            for (char ch = 'a'; ch <= 'z'; ch++) {
                String tmp = "" + ch;
                if (!str.contains(tmp)) {
                    ans = tmp;
                    break;
                }
            }
 
            if (ans != null) {
                System.out.println(ans);
                continue;
            }
 
            String st1 = null;
 
            for (char i = 'a'; i <= 'z'; i++) {
                for (char j = 'a'; j <= 'z'; j++) {
 
                    String st = "" + i + j;
 
                    if (!str.contains(st)) {
                        st1 = st;
                        break;
                    }
                }
                if (st1 != null) break;
            }
 
            if (st1 != null) {
                System.out.println(st1);
                continue;
            }
 
            String st2 = null;
 
            for (char i = 'a'; i <= 'z'; i++) {
                for (char j = 'a'; j <= 'z'; j++) {
                    for (char k = 'a'; k <= 'z'; k++) {
 
                        String st = "" + i + j + k;
 
                        if (!str.contains(st)) {
                            st2 = st;
                            break;
                        }
                    }
 
                    if (st2 != null) break;
                }
 
                if (st2 != null) break;
            }
 
            System.out.println(st2);
        }
    }
}