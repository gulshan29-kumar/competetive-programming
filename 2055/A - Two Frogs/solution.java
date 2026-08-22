import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            if(a<=2) System.out.println("No");
            else if((b-c)%2==0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}