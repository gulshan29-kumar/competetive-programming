import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // number of test cases
 
        while (t-- > 0) {
            String x = in.next(); // read x as string to access digits easily
            Set<Character> digits = new HashSet<>();
 
            // Store all digits of x in a set
            for (char ch : x.toCharArray()) {
                digits.add(ch);
            }
 
            // Check digits from 0 to 9
            for (int y = 0; y <= 9; y++) {
                if (digits.contains((char) ('0' + y))) {
                    System.out.println(y);
                    break;
                }
            }
        }
    }
}