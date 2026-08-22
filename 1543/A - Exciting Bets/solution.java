import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
           long a=in.nextLong();
           long b=in.nextLong();
           long diff=Math.abs(b-a);
           if(diff==0) System.out.println(0+" "+0);
            else{
                long min=Math.min((a-(a/diff)*diff),(a/diff+1)*diff-a);
                min=Math.min(Math.min(a,b),min);
                System.out.println(diff+" "+min);
           }
        }
    }
}