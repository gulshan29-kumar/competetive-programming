import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a=in.nextLong();
            long b=in.nextLong();
            long c=in.nextLong();
            if(a/c>=b||b>=a) System.out.println(1);
            else System.out.println(2);
        }
    }
}