import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int d=in.nextInt();
            int left=0-c;
            if(left>=b) System.out.println((0-b)+" "+0);
            else System.out.println(c+" "+(c+b));
        }
    }
}