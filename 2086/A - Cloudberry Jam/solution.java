import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
 
        while (t--> 0) {
            int a=in.nextInt();
            int b=a*3;
            System.out.println((b*4)/6);
        }
    }
}