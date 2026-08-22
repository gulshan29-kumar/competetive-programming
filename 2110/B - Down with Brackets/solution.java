import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            String s = in.next();
            int balance = 0;
            boolean onlyBalancedAtEnd = true;
 
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    balance++;
                } else {
                    balance--;
                }
 
 
                if (balance == 0 && i != s.length() - 1) {
                    onlyBalancedAtEnd = false;
                    break;
                }
            }
 
            if (onlyBalancedAtEnd) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}