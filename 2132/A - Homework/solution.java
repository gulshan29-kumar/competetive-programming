import java.util.*;
 
public class god {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int a = in.nextInt();              // length of first string
            StringBuilder str = new StringBuilder(in.next());
 
            int b = in.nextInt();              // length of second string
            StringBuilder str1 = new StringBuilder(in.next());
            StringBuilder str2 = new StringBuilder(in.next());
 
            // Ensure we only process within str1 length
            for (int i = 0; i < b && i < str1.length(); i++) {
                if (str2.charAt(i)=='D') {
                    str.append(str1.charAt(i));      // even → append
                } else {
                    str.insert(0, str1.charAt(i));   // odd → insert at start
                }
            }
 
            System.out.println(str);
        }
 
        in.close();
    }
}