import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long x=in.nextLong();
            long y=in.nextLong();
            long c=x-1;
            long d=y;
            if(x<y) System.out.println(2);
            else {
                if(c>d&&y!=1) System.out.println(3);
                else System.out.println(-1);
            }
 
        }
    }
}