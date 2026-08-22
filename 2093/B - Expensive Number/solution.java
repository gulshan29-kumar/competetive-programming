import java.util.*;
 
public class question{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
 
        while (t--> 0) {
            String str=in.next();
            long count=0;
            long zero0=0;
            for(int i=1;i<str.length();i++){
                if(str.charAt(i)=='0') zero0++;
                else count=zero0;
            }
            System.out.println(str.length()-count-1);
        }
    }
}