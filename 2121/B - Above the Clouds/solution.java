import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int a = in.nextInt();
            String str = in.next();
 
            if (a < 3) {
                System.out.println("No");
            } else {
                boolean found = false;
                Set<Character> set = new HashSet<>();
 
                for (int i = 1; i < a - 1; i++) {
                    if (set.contains(str.charAt(i))) {
                        found = true;
                        break;
                    } else {
                        set.add(str.charAt(i));
                    }
                }
 
                if (found) {
                    System.out.println("Yes");
                } else {
                    if (set.contains(str.charAt(0)) || set.contains(str.charAt(a - 1))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }
        in.close(); // optional but recommended
    }
}