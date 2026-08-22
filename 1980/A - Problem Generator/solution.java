import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
 
        while (t-- > 0) {
            int d=in.nextInt();
            int b=in.nextInt();
            String a = in.next(); // Read input string
 
            // Check presence of letters and convert to 1 or 0
            int count=0;
            for(int i=0;i<7;i++){
                int boo2=0;
                for(int j=0;j<a.length();j++){
                    if('A'+i!=a.charAt(j)){
                        boo2++;
                    }
 
 
                }
                if(a.length()-boo2>=b) count+=b;
                else count+=a.length()-boo2;
            }
            System.out.println(7*b-count);
        }
 
        in.close(); // Close the scanner
    }
}